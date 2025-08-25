package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TestDao;
import com.example.demo.model.Employee;


@RestController
@RequestMapping("api/v1/employees")
@CrossOrigin
public class TestController {

	@Autowired
	TestDao dao;
	
	@GetMapping
	public List<Employee> getAlllist(){
		
		List<Employee> ls= dao.findAll();
	return ls;
		
	}
	
	@PostMapping
	public String createEmployee(@RequestBody Employee emp) {
		
		 try {
			dao.save(emp);
			
			return "success";
		} catch (Exception e) {
			return e.getMessage();
		}
		
	}
	
}
