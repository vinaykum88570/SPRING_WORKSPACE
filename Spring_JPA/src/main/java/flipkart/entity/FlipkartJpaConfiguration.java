package flipkart.entity;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.stereotype.Component;

@Configuration
public class FlipkartJpaConfiguration {
	
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		dataSource.setUsername("c##dilip");
		dataSource.setPassword("dilip");
		
		return dataSource;
	}
	
	@Bean
	LocalContainerEntityManagerFactoryBean getEntityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		
		//1. Setting Datasource Object // DB details 
		factory.setDataSource(getDataSource());
		
		// 2. Provide package information of entity classes
		factory.setPackagesToScan("flipkart.*");
		
		//3. Providing Hibernate Details to EM
		factory.setJpaProperties(hibernateProperties());
		
		//4. Passing Predefined Hiberante Adaptor Object EM
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		factory.setJpaVendorAdapter(adapter);
		
		return factory;
		
	}
	
	// these are all from hibernate FW , Predefined properties : Keys
	Properties hibernateProperties() {
		Properties props = new Properties();
		props.setProperty("hibernate.hbm2ddl.auto","validate");
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle12cDialect");
		return props;
	}
	
	

}
