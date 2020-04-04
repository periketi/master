package com.SpringBootCURD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.repository")
@ComponentScan({"com.controller","com.service","com.dao"})
@EntityScan("com.entities")
public class SpringBootCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCurdApplication.class, args);
	}
}
