package com.app.marketingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration  
@ComponentScan(basePackages = "com.aap.marketingApp.model")
@EnableJpaRepositories("com.app.marketingapp.dao")
public class MarketingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketingappApplication.class, args);
	}
}
