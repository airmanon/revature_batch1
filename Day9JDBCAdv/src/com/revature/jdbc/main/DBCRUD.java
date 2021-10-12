package com.revature.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.revature.jdbc.entity.Employee;

public class DBCRUD {

	private static Connection connection = null;
	private static Statement statement = null;
	private static PreparedStatement preparedStmt = null;
	private static ResultSet result = null;

	public static void connect() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/revature", "root", "root");
	}

	public static int insert(Employee employee) throws Exception {
		int insertStatus = 0;
		String insertQuery = "INSERT INTO employee (`name`,`email`) VALUES (?,?);";
		preparedStmt = connection.prepareStatement(insertQuery);

		preparedStmt.setString(1, employee.getName());
		preparedStmt.setString(2, employee.getEmail());
		insertStatus = preparedStmt.executeUpdate();
		return insertStatus;
	}

	public static int update(int id, Employee employee) throws Exception {
		String updateQuery = "UPDATE `employee` SET `name` = ?,`email` = ? WHERE `id` = ?;"; // creating a query
		preparedStmt = connection.prepareStatement(updateQuery); // creating prepared Statement
		preparedStmt.setInt(3, id);
		preparedStmt.setString(1, employee.getName());
		preparedStmt.setString(2, employee.getEmail());

		int updateStatus = 0;
		updateStatus = preparedStmt.executeUpdate();
		return updateStatus;
	}

	public static int delete(int id) throws Exception {
		String deleteQuery = "DELETE FROM `revature`.`employee` WHERE `id`=?;"; // creating a query
		preparedStmt = connection.prepareStatement(deleteQuery); // creating prepared Statement
		preparedStmt.setInt(1, id);

		int deleteStatus = 0;
		deleteStatus = preparedStmt.executeUpdate();
		return deleteStatus;
	}

	public static void findAll() throws Exception {
		String query = "select * from employee";
		statement = connection.createStatement();
		// 4) Storing & Processing the Result (ResultSet[I])
		result = statement.executeQuery(query);
		System.out.println("ID \t Name \t\t Email");
		while (result.next()) {
			System.out.println(result.getInt("id") + "\t" + result.getString(2) + "\t \t" + result.getString(3));
		}
	}

	public static void findById(int id) throws Exception {
		String query = "select * from employee where id=" + id;
		statement = connection.createStatement();
		// 4) Storing & Processing the Result (ResultSet[I])
		result = statement.executeQuery(query);
		System.out.println("ID \t Name \t\t Email");
//		Employee employee = new Employee();
		while (result.next()) {
			System.out.println(result.getInt("id") + "\t" + result.getString(2) + "\t \t" + result.getString(3));
//			employee.setId(result.getInt(id));
//			employee.setName(result.getString("name"));
//			employee.setEmail(result.getString("email"));
		}
//		return employee;
	}

	public static void closeResource() throws Exception {
		if (result != null) {
			result.close();
		}
		if (preparedStmt != null) {
			preparedStmt.close();
		}
		if (statement != null) {
			statement.close();
		}
		if (connection != null) {
			connection.close();
		}

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

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

	}

}
