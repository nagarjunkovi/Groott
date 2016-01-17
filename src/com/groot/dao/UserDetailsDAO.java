package com.groot.dao;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.groot.bean.UserLogin;
import com.groot.mappers.UserDetailsMapper;

public class UserDetailsDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public UserLogin getUserDetails(String userID){
		String SQL = "select * from user_details where User_Name = ?";
		UserLogin userDetails = null;
		try{
			userDetails = jdbcTemplateObject.queryForObject(SQL,new Object[]{userID},new UserDetailsMapper());
		}catch(EmptyResultDataAccessException ex){
			System.out.println("Empty data");
		}
		return userDetails;
	}

	public int insertUserDetails(UserLogin userLogin){
		String SQL = "INSERT INTO userdetails (User_Name,Password,First_Name,Last_Name,Email_Address,Phone_Number) VALUES(?,?,?,?,?,?)";
		int i = jdbcTemplateObject.update(SQL, userLogin.getUserName(),userLogin.getPassword(),userLogin.getFirstName(),userLogin.getLastName(),userLogin.getEmail(),userLogin.getPhoneNumber());
		return i;
	}
}
