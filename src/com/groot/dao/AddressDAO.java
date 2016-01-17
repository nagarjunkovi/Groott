package com.groot.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.groot.bean.AddressBean;

public class AddressDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public void addAddress(AddressBean addressBean){
		String SQL = "INSERT INTO address (Address_ID,Address1,Address2,City,State,Zip_Code,User_Name) VALUES(?,?,?,?,?,?,?)";
		jdbcTemplateObject.update(SQL, addressBean.getAddressID(),addressBean.getAddress1(),addressBean.getAddress2(),addressBean.getCity(),
				addressBean.getState(),addressBean.getZipCode(),"nkovi");
	}
}
