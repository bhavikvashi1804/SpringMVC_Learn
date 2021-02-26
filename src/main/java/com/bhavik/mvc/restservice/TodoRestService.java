package com.bhavik.mvc.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bhavik.mvc.model.Todo;
import com.bhavik.mvc.service.TodoService;

@RestController
public class TodoRestService {
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value = "/todos", method = RequestMethod.GET)
	public List<Todo> getAllTodo(){
		return service.retrieveTodos("bhavik");
	}

}
