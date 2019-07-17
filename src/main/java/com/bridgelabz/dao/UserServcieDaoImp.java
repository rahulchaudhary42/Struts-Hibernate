package com.bridgelabz.dao;
 
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
  
import com.bridgelabz.pojo.User;
import com.bridgelabz.utility.HibernateUtil;
import com.bridgelabz.utility.MailSender;

public class UserServcieDaoImp implements IUserServiceDao
{
	
	private static UserServcieDaoImp userServcieDaoImp;
	MailSender mailSender = new MailSender();
	private UserServcieDaoImp() {

	}

	public static synchronized UserServcieDaoImp getinstance() {
		if (userServcieDaoImp == null) {
			userServcieDaoImp = new UserServcieDaoImp();
			return userServcieDaoImp;
		}
		return userServcieDaoImp;
	}

	public String register(User user) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		return user.getName();
	}

	public Boolean login(String email, String password) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String sql = " from User u where u.email=:email and u.password=:password";
		Query query = session.createQuery(sql);
		query.setParameter("email", email);
		query.setParameter("password", password);
		@SuppressWarnings("unchecked")
		List<User> list = query.list();
		if (list.size() > 0) {
			session.close();
			return true;
		}
		session.close();
		return false;
	}

	public Boolean forget(String email) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String sql = " from User u where u.email=:email";
		Query query = session.createQuery(sql);
		query.setParameter("email", email);

		User user = (User) query.uniqueResult();
		if (user != null) {
			mailSender.sendMail(email, user.getUserId()+"enter the code to change the passcode",   "http://localhost:8080/STRUTS/reset.jsp");
			session.close();
			return true;
		}
		session.close();
		return false;
	}

	public Boolean reset(long userId, String password) {
		 Session  session=HibernateUtil.getSessionFactory().openSession();
			User user = (User) session.get(User.class, userId);
			user.setPassword(password);
			Transaction transaction = session.beginTransaction();
			String username = (String) session.save(user);
			System.out.println("reset password : "+username);
			transaction.commit();
			session.close();
		return null;
	}


}
