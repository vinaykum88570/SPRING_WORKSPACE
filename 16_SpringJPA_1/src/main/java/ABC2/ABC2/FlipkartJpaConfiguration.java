	package ABC2.ABC2;

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
@ComponentScan("ABC2.ABC2")
@EnableJpaRepositories("ABC2.ABC2")
public class FlipkartJpaConfiguration {

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://@localhost:3306/springdb");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    @Bean("entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

        LocalContainerEntityManagerFactoryBean factory =
                new LocalContainerEntityManagerFactoryBean();

        factory.setDataSource(getDataSource());

        factory.setPackagesToScan("ABC2.ABC2");

        factory.setJpaProperties(hibernateProperties());

        HibernateJpaVendorAdapter adapter =
                new HibernateJpaVendorAdapter();

        factory.setJpaVendorAdapter(adapter);

        return factory;
    }
    
    @Bean("transactionManager")
    public PlatformTransactionManager transactionManager() {
           JpaTransactionManager transactionManager = new JpaTransactionManager();
           transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return transactionManager;
    }

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