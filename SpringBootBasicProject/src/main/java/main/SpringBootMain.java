package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class SpringBootMain {

	public static void main(String[] args) {
		ApplicationContext ctxt = SpringApplication.run(SpringBootMain.class, args);
	}

}
