package com.groot.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.groot.bean.UserLogin;
import com.groot.facade.UserDetailsFacade;

@Controller
public class LoginController {
	private static final Logger logger = Logger.getLogger(LoginController.class);

	@Autowired
	private UserDetailsFacade userDetailsFacade;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView  userLogin(){
		logger.info("User Login Called");
		return new ModelAndView("login", "loginParam", new UserLogin());
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String  userLogin(UserLogin login, ModelMap modal){
		UserLogin userDetails = userDetailsFacade.getUserDetails(login.getUserID());
		modal.put("userDetails", userDetails);
		return "main";
	}
}
