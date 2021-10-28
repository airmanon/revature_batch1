package com.revature.coursemgmt;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.coursemgmt.dao.CourseDAO;
import com.revature.coursemgmt.dao.StudentDAO;
import com.revature.coursemgmt.model.Course;
import com.revature.coursemgmt.model.Student;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class App {

	public static void main(String[] args) {
		Javalin app = Javalin.create(config -> {
			config.addStaticFiles("/public", Location.CLASSPATH);
		}).start(7090);

		Logger logger = LoggerFactory.getLogger(App.class);

		app.get("/", ctx -> ctx.html("<h1>Welcome to Javalin </h1>"));

//		List<Student> students = new ArrayList<Student>();
//
//		Student student = new Student(100, "test", "test@gmail.com", 9944159844l, 1);
//		students.add(student);
//		students.add(new Student(101, "abc", "abc@gmail.com", 9944159844l, 2));
//		students.add(new Student(102, "xyz", "xyz@gmail.com", 9944159844l, 3));
//		app.get("/student", ctx -> ctx.json(student));
//
//		app.get("students", ctx -> ctx.jsonStream(students));

		List<Student> students = StudentDAO.readAll();

		app.get("/students", ctx -> ctx.jsonStream(students));

		app.get("/students/{id}", ctx -> {
			int id = Integer.parseInt(ctx.pathParam("id"));
			Student stu = StudentDAO.readById(id);
			ctx.json(stu);
		});

		app.post("students", ctx -> {
			Student stu = ctx.bodyAsClass(Student.class);
			logger.info("This the student object from postman :" + stu);
			StudentDAO.save(stu);
			ctx.status(201);
		});

		app.get("studentForm", ctx -> ctx.redirect("addStudent.html"));

		app.post("studentsForm", ctx -> {

			String name = ctx.formParam("name");
			String email = ctx.formParam("email");
			Long mobile = Long.parseLong(ctx.formParam("mobile"));
			int courseId = Integer.parseInt(ctx.formParam("courseId"));
			Student stu = new Student(name, email, mobile, courseId);
			logger.info("This the student object from postman :" + stu);
			StudentDAO.save(stu);
			ctx.status(201);
		});

		app.put("students/{id}", ctx -> {
			int id = Integer.parseInt(ctx.pathParam("id"));
			Student stu = ctx.bodyAsClass(Student.class);
			StudentDAO.update(id, stu);
			ctx.status(200);
		});

		app.delete("students/{id}", ctx -> {
			int id = Integer.parseInt(ctx.pathParam("id"));
			StudentDAO.delete(id);
			ctx.status(200);
		});

		List<Course> courses = CourseDAO.findAll();

		app.get("/course", ctx -> ctx.jsonStream(courses));

		app.get("/course/{id}", ctx -> {
			int id = Integer.parseInt(ctx.pathParam("id"));
			Course course = CourseDAO.findById(id);
			ctx.json(course);
		});

		app.post("course", ctx -> {
			Course cour = ctx.bodyAsClass(Course.class);
//			logger.info("This the student object from postman :" + stu);
			CourseDAO.save(cour);
			ctx.status(201);
		});

		app.put("course/{id}", ctx -> {
			int id = Integer.parseInt(ctx.pathParam("id"));
			Course cour = ctx.bodyAsClass(Course.class);
			CourseDAO.update(id, cour);
			ctx.status(200);
		});

		app.delete("course/{id}", ctx -> {
			int id = Integer.parseInt(ctx.pathParam("id"));
			CourseDAO.delete(id);
			ctx.status(200);
		});

	}

}
