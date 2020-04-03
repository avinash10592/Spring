package com.springmvc.hibernate.service;

import java.util.List;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springmvc.hibernate.pojo.User;

public class AuthService {

	private HibernateTemplate hibernateTemplate;
	private static Logger log = Logger.getLogger(AuthService.class);

	private AuthService() {
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public boolean findUser(String uname, String upwd) {
		log.info("Checking the user in the database");
		boolean isValidUser = false;
		String sqlQuery = "from User u where u.name=? and u.password=?";
		try {
			List userObj = (List) hibernateTemplate.find(sqlQuery, uname, upwd);
			if (userObj != null && userObj.size() > 0) {
				log.info("Id= " + ((Object) userObj.get(0)).getid() + ", Name= " + ((Category) userObj.get(0)).getName() + ", Password= "
						+ ((User) userObj.get(0)).getPassword());
				isValidUser = true;
			}
		} catch (Exception e) {
			isValidUser = false;
			log.error("An error occurred while fetching the user details from the database", e);
		}
		return isValidUser;
	}
}

