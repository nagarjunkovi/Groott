package com.groot.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groot.bean.UserLogin;
import com.groot.dao.UserDetailsDAO;


public class UserDetailsFacade {

	@Autowired
	private UserDetailsDAO UserDetailsDAO;
	
	public UserLogin getUserDetails(String userID){
		System.out.println("Facade called");
		UserLogin userDetails=  UserDetailsDAO.getUserDetails(userID);
		return userDetails;
	}
}
