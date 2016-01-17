package com.groot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
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
	public String  userLogin(UserLogin login, ModelMap modal, HttpServletRequest request){
		logger.info("User submitted data userName : "+login.getUserName());
		UserLogin userDetails = userDetailsFacade.getUserDetails(login.getUserName());
		if(userDetails != null && userDetails.getPassword().equals(login.getPassword())){
			logger.info("User successfully logged in userName : "+login.getUserName());
			HttpSession session = request.getSession();
			session.setAttribute("userName", login.getUserName());
		}
		modal.put("userDetails", userDetails);
		return "main";
	}
}
