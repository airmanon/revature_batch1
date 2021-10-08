package com.revature;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.entity.Employee;
import com.revature.main.DBCRUD;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FirstServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			PrintWriter out = response.getWriter();
			out.println(" <br> <h2> <b>Welcome to Servlet </b> </h2>");
			Scanner input = new Scanner(System.in);
			int choice = 0;
			DBCRUD.connect();
			Employee employee = new Employee();
			int id = 0;
			String name = null;
			String email = null;
			int status = 0;

			while (choice >= 0) {
				System.out.println(" \t\t\t\t 1) Insert Employee Record ");
				System.out.println(" \t\t\t\t 2) Update Employee Record ");
				System.out.println(" \t\t\t\t 3) Delete Employee Record ");
				System.out.println(" \t\t\t\t 4) Get all Employees ");
				System.out.println(" \t\t\t\t 5) Get Employee by ID ");
				System.out.println(" \t\t\t\t 6) Exit");
				System.out.print("Enter your choice [1-6]:");
				choice = input.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Enter Name of the Employee :");
					name = input.next();
					System.out.print("Enter Email of the Employee :");
					email = input.next();
					employee.setName(name);
					employee.setEmail(email);
					status = DBCRUD.insert(employee);
					for (int i = 0; i < 50; ++i)
						System.out.println();
					if (status != 0)
						System.out.println("Employee Record Added Successfully!!!");
					break;
				case 2:
					System.out.print("Enter ID of the record to update :");
					id = input.nextInt();
//				employee = DBCRUD.findById(id);
					employee.setId(id);
					System.out.print("Enter Name of the Employee to Update:");
					name = input.next();
					System.out.print("Enter Email of the Employee to Update:");
					email = input.next();

					employee.setName(name);
					employee.setEmail(email);
					status = DBCRUD.update(id, employee);
					for (int i = 0; i < 50; ++i)
						System.out.println();
					if (status != 0)
						System.out.println("Employee Record Updated Successfully!!!");
					break;
				case 3:
					System.out.print("Enter ID of the record to delete :");
					id = input.nextInt();
					status = DBCRUD.delete(id);
					for (int i = 0; i < 50; ++i)
						System.out.println();
					if (status != 0)
						System.out.println("Employee Record Deleted Successfully!!!");
					break;
				case 4:
					DBCRUD.findAll();
					for (int i = 0; i < 10; ++i)
						System.out.println();
					break;
				case 5:
					System.out.print("Enter ID of the record to view :");
					id = input.nextInt();
					DBCRUD.findById(id);
					for (int i = 0; i < 5; ++i)
						System.out.println();
					break;
				case 6:
					DBCRUD.closeResource();
					System.out.println("Thanks for using our Application.");
					System.exit(0);
					break;
				default:
					System.out.println("Please Enter any value between 1 to 6");
					break;
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
