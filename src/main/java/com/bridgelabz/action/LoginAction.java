package com.bridgelabz.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.bridgelabz.dao.IUserServiceDao;
import com.bridgelabz.dao.UserServcieDaoImp;

@Action(value = "login", results = { @Result(name = "SUCCESS", location = "/success-login.jsp"),

		@Result(name = "ERROR", location = "login.jsp") })

public class LoginAction {
	
	private String email;
	private String password;
	
	private IUserServiceDao serviceDao = UserServcieDaoImp.getinstance();
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute()
	{
		if(serviceDao.login(getEmail(), getPassword())) {
			System.out.println("in log me");
			return "SUCCESS";
		}
		return "ERROR" ;
		
	}

}
