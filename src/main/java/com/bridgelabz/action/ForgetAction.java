package com.bridgelabz.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

 
import com.bridgelabz.dao.IUserServiceDao;
import com.bridgelabz.dao.UserServcieDaoImp;
@Namespace("/")
@Action(value = "forget",results = { @Result(name = "SUCCESS", location = "/success-forget.jsp"),
		@Result(name = "ERROR", location = "forget.jsp") })
public class ForgetAction {
	
	 private String email;
	 private IUserServiceDao serviceDao = UserServcieDaoImp.getinstance();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	 
	public String execute() {
		System.out.println("in method excute method forgot  ");
		if(serviceDao.forget(getEmail())) {
		System.out.println("in log me");
		return "SUCCESS";
	}
	return "ERROR" ;

	}
	 
	 
	 

}
