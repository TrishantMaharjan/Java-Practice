package com.companyname.springprojectdemo.service;

import com.companyname.springprojectdemo.model.User;

public interface UserService {
	
	void userSignup(User user);
	User userLogin(String un, String psw);
	
}
