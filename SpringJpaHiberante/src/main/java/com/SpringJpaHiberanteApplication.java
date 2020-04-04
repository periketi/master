package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="repo")
public class SpringJpaHiberanteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaHiberanteApplication.class, args);
	}
}
