package com.example.spring3.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.seasar.doma.jdbc.tx.LocalTransaction;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.spring3.dao.AppConfig;
import com.example.spring3.dao.Todo;
import com.example.spring3.dao.TodoDao;
import com.example.spring3.dao.TodoDaoImpl;
import com.example.spring3.form.TodoList;

@Controller
@SessionAttributes
public class TodoListController {

	@ModelAttribute("todoList")
	public TodoList getTodoList() {

		
		TodoList todoList = new TodoList();
		System.out.println("Contents:" + todoList.getContents() + "Emergency:" + todoList.getEmergency());

		
		return todoList;
	}

	@RequestMapping(value = "/addTodo", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("todoList") TodoList todoList,
			BindingResult result) {

		//todoList.setContents(Contents);

		//System.out.println("Contents:" + todoList.getContents() + "Emergency:" + todoList.getEmergency());
		LocalTransaction tx = AppConfig.getLocalTransaction();

		tx.begin();
		Todo todoii = new Todo();
		TodoDao dao;
		dao = new TodoDaoImpl();

		
		
		System.out.println("result = " + todoList.getId());
		todoii.Id = dao.selectAll().size() + 1;
		todoii.Contents = todoList.getContents();
		System.out.println("result1 = " + todoList.getContents());
		todoii.Emergency = Integer.parseInt(todoList.getEmergency());
		todoii.Date = java.sql.Date.valueOf(todoList.getDate());
		dao.insert(todoii);
		tx.commit();
		
		return "redirect:todoList.html";
	}

	
	@RequestMapping("/todoList")
	public ModelAndView showTodoList() {
		TodoList todolist = new TodoList();
		Date date = new Date();
		todolist.setDate(date.toString());
		todolist.setContents("test");

		LocalTransaction tx = AppConfig.getLocalTransaction();
		List<Todo> todoAll;
		Todo todoi;
		
		try {
			tx.begin();
			TodoDao dao;
			dao = new TodoDaoImpl();
			todoi = dao.selectById(1);
			//todoi.Version = todoi.Version + 1;
			todoAll = dao.selectAll();
			//System.out.println("ID = " + todoi.Id);
			//todoi.Contents = "setbydao2";
			//todoi.Emergency = 1;
			todoi.Date = new java.sql.Date(System.currentTimeMillis());
			//dao.update(todoi);
			tx.commit();
		} finally {
			tx.rollback();
		}

		//複数のモデルを返したい時はMapにぶち込む
		Map map = new HashMap();
	    map.put("todoAll", todoAll);
	    map.put("todoi", todoi);
		
		ModelAndView model = new ModelAndView("todoList", "map", map);
		return model;
	}
}