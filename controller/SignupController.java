package com.ncc.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ncc.spring.dao.UserDao;
import com.ncc.spring.model.User;

@Controller
public class SignupController {
	@Autowired
	private UserDao udao;
	@RequestMapping(value = "/signup",method = RequestMethod.GET)
	public String getSignup()
	{
		return "signup";
	}
	@RequestMapping(value = "/signup",method = RequestMethod.POST)
	public String saveSignup(@ModelAttribute User u)
	{
		u.setPassword(DigestUtils.md5DigestAsHex(u.getPassword().getBytes()));
		udao.signup(u);
		return "login";
	}

}
