package com.bridgelabz.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import com.bridgelabz.dao.IUserServiceDao;
import com.bridgelabz.dao.UserServcieDaoImp;
import com.bridgelabz.pojo.User;
import com.bridgelabz.utility.MailSender;

@Action(value = "register", results = { @Result(name = "SUCCESS", location = "/success-registration.jsp"),

		@Result(name = "ERROR", location = "welcome.jsp") })
public class RegisterAction {
	
	private String name;
	private String email;
	private String password;
	private String mobileno;
	
	private IUserServiceDao serviceDao = UserServcieDaoImp.getinstance();
	MailSender mailSender = new MailSender();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String execute()
	{
		System.out.println("aaa");
	
		User user = new User();
		user.setName(getName());
		user.setEmail(getEmail());
		user.setPassword(getPassword());
		user.setMobileno(getMobileno());
		if (serviceDao.register(user) != null) {
			mailSender.sendMail(user.getEmail(), "welcome", user.toString());
			System.out.println("execute called");
			return "SUCCESS";
		}
		return "ERROR";
		 
		
	}
}
