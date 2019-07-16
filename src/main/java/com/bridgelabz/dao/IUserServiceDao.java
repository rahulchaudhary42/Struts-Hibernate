package com.bridgelabz.dao;

import com.bridgelabz.pojo.User;

public interface IUserServiceDao {

	public String register(User user);
	public Boolean login(String email,String password);
}
