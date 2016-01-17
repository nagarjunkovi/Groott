package com.groot.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.groot.bean.AddressBean;
import com.groot.facade.AddressFacade;

@Controller
public class AddressController {

	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	@Autowired
	private AddressFacade addressFacade;
	
	@RequestMapping(value="/addAddress", method=RequestMethod.GET)
	public ModelAndView  addAddress(HttpServletRequest request){
		logger.info("AddAddress Called");
		System.out.println(request.getSession().getAttribute("userName"));
		return new ModelAndView("addAddress", "addressBean", new AddressBean());
	}
	
	@RequestMapping(value="/addAddress", method=RequestMethod.POST)
	public String  addAddress(AddressBean addressBean){
		logger.info("AddAddress Called with data");
		addressFacade.addAddress(addressBean);
		return "main";
	}
}
