package com.vinay;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@ComponentScan("com.*")
@EnableJpaRepositories("com.*")
public class SpringJPAConfiguration {

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new  DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://@localhost:3306/springdb");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	@Bean("entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setDataSource(getDataSource());
		factory.setPackagesToScan("com.*");
		factory.setJpaProperties(getproperties());
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		factory.setJpaVendorAdapter(adapter);
		return factory;
    }
	
	@Bean("transactionManager")
	public PlatformTransactionManager transactonManger() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return transactionManager;
	}
	
	public Properties getproperties() {
		Properties prop = new Properties();
		prop.setProperty("hibernate.hbm2ddl.auto", "update");
		prop.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
		prop.setProperty("hibernate.show_sql", "true");
		return prop;
	}
	
}
