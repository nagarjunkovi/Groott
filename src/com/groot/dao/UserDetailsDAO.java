package com.groot.dao;

import java.util.List;

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
		String SQL = "select * from userdetails where UserID = ?";
		UserLogin userDetails = null;
		try{
			userDetails = jdbcTemplateObject.queryForObject(SQL,new Object[]{userID},new UserDetailsMapper());
		}catch(EmptyResultDataAccessException ex){
			System.out.println("Empty data");
		}
		return userDetails;
	}

	public void insertUserDetails(){
		String SQL = "INSERT INTO userdetails (UserName,Password,Email,UserID) VALUES(?,?,?,?)";
		jdbcTemplateObject.update(SQL, "Ashok","intel@01","nkovi2020@gmail.com","");
	}
}
