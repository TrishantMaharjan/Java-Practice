package com.companyname.springprojectdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.companyname.springprojectdemo.model.User;
import com.companyname.springprojectdemo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public String getLogin() {
		return "LoginForm";
	}
	
	@GetMapping("/login")
	public String getLoginfromSignup() {
		return "LoginForm";
	}
	
	@GetMapping("/home")
	public String getHome() {
		return "Home";
	}
	
	@PostMapping("/login")
	public String postLogin(@ModelAttribute User user, Model model) {
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
		User usr = service.userLogin(user.getUsername(), user.getPassword());
		if(usr != null) {
			model.addAttribute("uname", usr.getFname());
			return "Home";
		}
		model.addAttribute("message", "User doesn't exist");
		return "LoginForm";
	}
	
	@GetMapping("/signup")
	public String getSignup() {
		return "SignupForm";
	}
	
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User user, Model model) {
		if(user.getConcent() != "") {
			user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
			service.userSignup(user);
			return "LoginForm";
		}
		model.addAttribute("message", "Please agree to the terms of service");
		return "SignupForm";
	}
	
	@GetMapping("/logout")
	public String getLogout() {
		return "LoginForm";
	}
	
}
