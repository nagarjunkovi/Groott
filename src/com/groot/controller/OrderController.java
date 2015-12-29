package com.groot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/orderManagement")
public class OrderController {

	@RequestMapping(value="/getOrderDetails", method=RequestMethod.GET)
	public String getOrderDetails(){
		System.out.println("Hey I ma callled");
		return "orderDetails";
	}
}
