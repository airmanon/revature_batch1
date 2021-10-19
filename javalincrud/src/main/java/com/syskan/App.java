package com.syskan;

import com.syskan.controller.UserController;

import io.javalin.Javalin;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javalin app = Javalin.create().start(7000);
		app.get("/hello", ctx -> ctx.html("Hello, Javalin!"));
		
		
		app.get("/users", UserController.fetchAllUsernames);
		app.get("/users/{id}", UserController.fetchById);
		app.post("/users", UserController.addUser);
	}

}
