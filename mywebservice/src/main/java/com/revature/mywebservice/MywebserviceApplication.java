package com.revature.mywebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revature.mywebservice.controller.FirstController;

@SpringBootApplication
public class MywebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MywebserviceApplication.class, args);
		FirstController obj = new FirstController();
		System.out.println(obj.welcome());
	}

}
