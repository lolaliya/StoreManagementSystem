package com.caps.sms.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class JPAConfig {


	@Bean            
	public LocalEntityManagerFactoryBean entityManagerFactoryBean() {        
		LocalEntityManagerFactoryBean entitymanagerfactorybean = new LocalEntityManagerFactoryBean();
		entitymanagerfactorybean.setPersistenceUnitName("myPersistenceUnit");  
		return entitymanagerfactorybean;
	}
}
