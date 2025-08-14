package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TestDao;
import com.example.demo.model.Employee;


@RestController
public class TestController {

	@Autowired
	TestDao dao;
	
	@GetMapping("getlist")
	public List<Employee> getAlllist(){
		
		List<Employee> ls= dao.findAll();
	
	return ls;
		
	}
	
}
