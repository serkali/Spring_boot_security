package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
//@EnableTransactionManagement
//@EnableJpaRepositories(basePackages="com.example.demo")
//@EntityScan(basePackages="demo.entity")
public class JmSpringBootSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmSpringBootSecurityApplication.class, args);
	}

}
