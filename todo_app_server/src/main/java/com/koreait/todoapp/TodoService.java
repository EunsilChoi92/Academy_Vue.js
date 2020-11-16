package com.koreait.todoapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
	@Autowired
	private TodoMapper mapper;
	
	public int insTodo(TodoVO param) {
		return mapper.insTodo(param);
	}
	
	public List<TodoVO> selTodoList() {
		return mapper.selTodoList();
	}

	public int delTodo(TodoVO param) {
		return mapper.delTodo(param);
	}
}
