package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBCRUD {

	private static Connection connection = null;
	private static Statement statement = null;
	private static PreparedStatement preparedStmt = null;
	private static ResultSet result = null;

	public static void connect() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/revature", "root", "root");
	}

	public static int insert() throws Exception {
		int insertStatus = 0;
		String insertQuery = "INSERT INTO employee (`name`,`email`) VALUES (?,?);";
		preparedStmt = connection.prepareStatement(insertQuery);

		preparedStmt.setString(1, "sundar");
		preparedStmt.setString(2, "sundar@google.com");
		insertStatus = preparedStmt.executeUpdate();
		return insertStatus;
	}

	public static int update() throws Exception {
		String updateQuery = "UPDATE `employee` SET `name` = ?,`email` = ? WHERE `id` = ?;"; // creating a query
		preparedStmt = connection.prepareStatement(updateQuery); // creating prepared Statement
		preparedStmt.setInt(3, 101);
		preparedStmt.setString(1, "abc123");
		preparedStmt.setString(2, "abc123@gmail.com");

		int updateStatus = 0;
		updateStatus = preparedStmt.executeUpdate();
		return updateStatus;
	}

	public static int delete() throws Exception {
		String deleteQuery = "DELETE FROM `revature`.`employee` WHERE `id`=?;"; // creating a query
		preparedStmt = connection.prepareStatement(deleteQuery); // creating prepared Statement
		preparedStmt.setInt(1, 101);

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
		while (result.next()) {
			System.out.println(result.getInt("id") + "\t" + result.getString(2) + "\t \t" + result.getString(3));
		}
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

		while (choice >= 0) {
			System.out.println(" \t\t 1) Insert a Record ");
			System.out.println(" \t\t 2) Update a Record ");
			System.out.println(" \t\t 3) Delete a Record ");
			System.out.println(" \t\t 4) Read all Record ");
			System.out.println(" \t\t 5) Read one Record ");
			System.out.println(" \t\t 6) Exit");
			System.out.println("Enter your choice [1-6]");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				DBCRUD.insert();
				break;
			case 2:
				DBCRUD.update();
				break;
			case 3:
				DBCRUD.delete();
				break;
			case 4:
				DBCRUD.findAll();
				break;
			case 5:
				DBCRUD.findById(101);
				break;
			case 6:
				DBCRUD.closeResource();
				System.exit(0);
				break;
			default:
				System.out.println("Please Enter any value between 1 to 6");
				break;
			}

		}

	}

}
