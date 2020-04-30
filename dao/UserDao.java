package com.ncc.spring.dao;

import com.ncc.spring.model.User;

public interface UserDao {
	
	public void signup(User u);
	User login(String un,String psw);

}
