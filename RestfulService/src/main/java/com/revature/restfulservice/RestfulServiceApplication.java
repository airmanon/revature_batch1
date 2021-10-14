package com.revature.restfulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulServiceApplication {

	public static void main(String[] args) {
		System.out.println("Command Line Argument :"+args[0]);
		SpringApplication.run(RestfulServiceApplication.class, args);
	}

}
