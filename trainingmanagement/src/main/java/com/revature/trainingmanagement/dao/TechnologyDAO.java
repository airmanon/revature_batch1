package com.revature.trainingmanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TechnologyDAO {
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
		String insertQuery = "INSERT INTO technology (`name`,`category`) VALUES (?,?);";
		preparedStmt = connection.prepareStatement(insertQuery);

		preparedStmt.setString(1, "BootStrap");
		preparedStmt.setString(2, "front end");
		insertStatus = preparedStmt.executeUpdate();
		return insertStatus;
	}

	public static int update() throws Exception {
		String updateQuery = "UPDATE `technology` SET `category` = ? WHERE `id` = ?;"; // creating a query
		preparedStmt = connection.prepareStatement(updateQuery); // creating prepared Statement
		preparedStmt.setInt(2, 4);
		preparedStmt.setString(1, "framework");

		int updateStatus = 0;
		updateStatus = preparedStmt.executeUpdate();
		return updateStatus;
	}

	public static int delete() throws Exception {
		String deleteQuery = "DELETE FROM `revature`.`technology` WHERE `id`=?;"; // creating a query
		preparedStmt = connection.prepareStatement(deleteQuery); // creating prepared Statement
		preparedStmt.setInt(1, 9);

		int deleteStatus = 0;
		deleteStatus = preparedStmt.executeUpdate();
		return deleteStatus;
	}

	public static void findAll() throws Exception {
		String query = "select * from technology";
		statement = connection.createStatement();
		// 4) Storing & Processing the Result (ResultSet[I])
		result = statement.executeQuery(query);
		System.out.println("ID \t Name \t\t category");
		while (result.next()) {
			System.out.println(result.getInt("id") + "\t" + result.getString(2) + "\t \t" + result.getString(3));
		}
	}

	public static void findById(int id) throws Exception {
		String query = "select * from technology where id=" + id;
		statement = connection.createStatement();
		// 4) Storing & Processing the Result (ResultSet[I])
		result = statement.executeQuery(query);
		System.out.println("ID \t Name \t\t category");
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


}
