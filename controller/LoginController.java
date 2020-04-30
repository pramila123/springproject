package com.ncc.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ncc.spring.dao.FeeDao;
import com.ncc.spring.dao.StudentDao;
import com.ncc.spring.dao.UserDao;
import com.ncc.spring.model.User;

@Controller
public class LoginController {
	@Autowired
	private UserDao udao;
	@Autowired
	private StudentDao sdao;
	@Autowired
	private FeeDao fdao;
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String getLoginForm()
	{
		return "login";
	}
@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String doLogin(@ModelAttribute User user,Model model)

	{
	user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
	User u=udao.login(user.getUsername(), user.getPassword());
	if(u!=null)
	{
		model.addAttribute("slist",sdao.getAll());
		model.addAttribute("flist",fdao.getAll());
		return "home";
	}
	else
	{
		model.addAttribute("msg","Invalid username and password");
		return "login";
	}
	}
}
