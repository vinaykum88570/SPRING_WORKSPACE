package com.spring.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoImpl implements AccountDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public void createAccount(int accountId, String accountType, float accountBalance) {
		String SQL = "insert into Account values(?,?,?)";
		jdbcTemplate.update(SQL,accountId,accountType,accountBalance);
		System.out.println("Account Created:");
		
	}

	@Override
	public void updatAccount(int accountId, float accountBalance) {
		String SQL ="update Account set accountBalance = ? where accountId = ?";
		jdbcTemplate.update(SQL,accountBalance,accountId);
		System.out.println("Account Update:");
	}
 
	@Override
	public void deleteAccount(int accountId) {
		String SQL ="delete from Account where accountId = ?";
		jdbcTemplate.update(SQL,accountId);
		System.out.println("Account Deleted:");
	}

	@Override
	public List<Map<String, Object>> getAllAccountDetails() {
		String SQL = "select * from Account";
		
		return jdbcTemplate.queryForList(SQL);
	}

	
}
