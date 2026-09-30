package com.spring.dao;

import java.util.List;
import java.util.Map;

public interface AccountDao {

	public void createAccount(int accountId, String	accountType , float accountBalance);
	public void updatAccount(int accountId,float accountBalance);
	public void deleteAccount(int accountId);
	public List<Map<String, Object>> getAllAccountDetails();
	
}
