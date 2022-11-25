package com.MisionTic.Login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@SpringBootApplication
@ComponentScan
@Component
public class LoginApplication {


	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}

}
