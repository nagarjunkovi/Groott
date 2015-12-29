package com.groot.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.groot.bean.UserLogin;

public class UserDetailsMapper implements RowMapper<UserLogin>{

	@Override
	public UserLogin mapRow(ResultSet rs, int arg1) throws SQLException {
		UserLogin ul = new UserLogin();
		ul.setEmail(rs.getString("Email"));
		ul.setPassword(rs.getString("Password"));
		ul.setUserName(rs.getString("UserName"));
		return ul;
	}

}
