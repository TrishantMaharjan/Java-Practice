package com.companyname.springprojectdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.companyname.springprojectdemo.model.Employee;
import com.companyname.springprojectdemo.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/employee")
	public String getEmployeeForm() {
		return "EmployeeForm";
	}
	
	@PostMapping("/employee")
	public String saveEmployee(@ModelAttribute Employee employee) {
		service.addEmp(employee);
		return "EmployeeForm";
	}
	
	@GetMapping("/list")
	public String getAll(Model model) {
		model.addAttribute("elist",service.getAllEmps());
		return "EmployeeList";
	}
}
