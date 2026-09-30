package com.spring.dao;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
		AccountDao dao = (AccountDao) context.getBean("account");
//		dao.createAccount(102,"Savings", 5000.0f);
//		dao.createAccount(103,"AAAAA", 36000.0f);
//		dao.createAccount(104,"BBBBB", 78300.0f);
//		dao.createAccount(105,"CCCCC", 83928.0f);
		
//		List<Map<String, Object>> allAccountDetails = dao.getAllAccountDetails();
//		for (Map<String, Object> map : allAccountDetails) {
//			System.out.println(map);
//		}
		
//		dao.updatAccount(101, 9999.0f);
		
		dao.deleteAccount(105);
	}

}
