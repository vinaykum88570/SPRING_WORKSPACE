package com.spring;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://@localhost:3306/springdb");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource; 
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
	    JdbcTemplate jdbcTemplate = new JdbcTemplate();
	    jdbcTemplate.setDataSource(getDataSource());  	
	    return jdbcTemplate;
	}
	
	@Bean
	public StudentDao studentDao() {
		StudentDaoiImpl dao = new StudentDaoiImpl();
		dao.setJdbcTemplate(getJdbcTemplate());
		return dao;
	}
	
	
	
	
	
	
	
	
	
}
