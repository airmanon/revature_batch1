package com.revature.main;

import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javalin app = Javalin.create().start(7000);

		app.get("/hello", ctx -> ctx.html("<h1>Hello World!!!This is Javalin</h1>"));
		app.get("welcome", ctx -> ctx.html("<h1>Welcome to Javalin World</h1>"));
		app.get("somedata/{name}", ctx -> ctx.html("<h1>Welcome " + ctx.pathParam("name") + " to Javalin!!! </h1>"));
		
		app.post("/example", new Handler() {			 
			@Override
			public void handle(Context ctx) throws Exception {
				String name = ctx.body();
				ctx.result(name);
			}
		});
		
		
	}

}
 