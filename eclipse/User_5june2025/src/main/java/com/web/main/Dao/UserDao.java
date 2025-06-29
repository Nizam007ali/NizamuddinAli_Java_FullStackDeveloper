package com.web.main.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.web.main.Entity.User;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public boolean insert(User user) {
		String sql = "INSERT INTO users (email, pass) VALUES (?, ?)";
		int result = jdbcTemplate.update(sql, user.getEmail(), user.getPass());
		return result > 0;
	}
	
	public boolean update(User user, String email) {
		String sql = "UPDATE users SET pass = ? WHERE email = ?";
		int result = jdbcTemplate.update(sql, user.getPass(), user.getEmail());
		return result > 0;
	}
	
	public boolean delete(String email) {
		String sql = "DELETE FROM users WHERE email = ?";
		int result = jdbcTemplate.update(sql, email);
		return result > 0;
	}
	
}
