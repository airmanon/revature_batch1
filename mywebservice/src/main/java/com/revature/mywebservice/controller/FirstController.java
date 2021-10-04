package com.revature.mywebservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping("/hello")
	public String welcome() {
		return "Hello User!!!Welcome to WebService!!!";
	}
	
	@RequestMapping(value = "/endpoint1",method = RequestMethod.GET)
	public String myMethod() {
		return "Another End point!!!";
	}
	
	@GetMapping("/endpoint2")
	public String myMethod2() {
		return "Yet Another End point";
	}
	
	@PutMapping("/endpoint2")
	public String myMethod3() {
		return "Yet Another End point";
	}
}
