package com.bhavik.mvc.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bhavik.mvc.model.Todo;
import com.bhavik.mvc.service.TodoService;

@RestController
public class TodoRestService {

	@Autowired
	TodoService service;

	@GetMapping(value = "/todos")
	public List<Todo> getAllTodo() {
		return service.retrieveTodos("bhavik");
	}

	@GetMapping("/todos/{id}")
	public Todo one(@PathVariable int id) {

		Todo todo = new Todo();
		List<Todo> list = service.retrieveTodos("bhavik");
		for(Todo t:list) {
			if(t.getId() == id) {
				todo = t;
			}
		}
		return todo;
	}
}
