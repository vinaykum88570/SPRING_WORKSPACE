package com.swiggy;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories("com.*")
public class SpringJpaConfiguration {

	//DB Details 
		@Bean
		public DataSource getDataSource() {
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql://localhost:3306/springdb");
			dataSource.setUsername("root");
			dataSource.setPassword("root");
			return dataSource;
		}

		@Bean("entityManagerFactory")
		LocalContainerEntityManagerFactoryBean createEntityManagerFactory() {
			LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();

			// 1. Setting Datasource Object // DB details
			factory.setDataSource(getDataSource());

			// 2. Provide package information of entity classes
			factory.setPackagesToScan("com.*");

			// 3. Providing Hibernate Properties to EM
			factory.setJpaProperties(hibernateProperties());

			// 4. Passing Predefined Hiberante Adaptor Object EM
			HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
			factory.setJpaVendorAdapter(adapter);

			return factory;
		}
		
		//PSrring JPA: configuring data based on your project req. 

		@Bean("transactionManager")
		public PlatformTransactionManager createTransactionManager() {
			JpaTransactionManager transactionManager = new JpaTransactionManager();
			transactionManager.setEntityManagerFactory(createEntityManagerFactory().getObject());
			return transactionManager;
		}
		
		// these are all from hibernate FW , Predefined properties : Keys
		Properties hibernateProperties() {
			 Properties prop = new Properties();
		        prop.setProperty("hibernate.hbm2ddl.auto", "update");
		        prop.setProperty("hibernate.dialect",
		                "org.hibernate.dialect.MySQL8Dialect");
		        prop.setProperty("hibernate.show_sql",
		                "true");
			return prop;
		}


}
