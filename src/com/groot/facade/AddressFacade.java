package com.groot.facade;

import org.springframework.beans.factory.annotation.Autowired;

import com.groot.bean.AddressBean;
import com.groot.dao.AddressDAO;

public class AddressFacade {
	
	@Autowired
	private AddressDAO addressDAO;
	
	public AddressBean addAddress(AddressBean addressBean){
		addressDAO.addAddress(addressBean);
		return addressBean;
	} 
}
