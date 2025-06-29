package com.web.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.web.main.beans.User;

@Repository
public class UserDAO {
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public boolean insert(User user) {
		String sql = "INSERT INTO users (email, pass) VALUES (:email, :pass)";
		int result = namedParameterJdbcTemplate.update(sql, 
				new java.util.HashMap<String, Object>() {{
					put("email", user.getEmail());
					put("pass", user.getPass());
				}});
		return result > 0;
	}
	
}
