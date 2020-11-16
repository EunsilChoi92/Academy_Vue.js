package com.koreait.todoapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TodoController {

	@Autowired
	private TodoService service;
	
	@RequestMapping("/selTodoList")
	public List<TodoVO> selTodoList() {
		return service.selTodoList();
	}
	
	@RequestMapping(value="/todo", method=RequestMethod.POST)
	public int insTodo(@RequestBody TodoVO param) {
		System.out.println("gg : " + param.getTodo());
		return service.insTodo(param);
	}
	
	@RequestMapping(value="/todo", method=RequestMethod.DELETE)
	public int delTodo(TodoVO param) {
		System.out.println("i_todo: " + param.getI_todo());
		return service.delTodo(param);
	}
}
