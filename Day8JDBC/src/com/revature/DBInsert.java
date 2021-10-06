package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBInsert {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver"); // loading & registering the driver

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/revature", "root", "root"); // establishing connection
																														

		String insertQuery = "INSERT INTO employee (`id`,`name`,`email`) VALUES (?,?,?);"; // creating a query
		PreparedStatement pstmt = connection.prepareStatement(insertQuery); // creating prepared Statement
		pstmt.setInt(1, 100);
		pstmt.setString(2, "abc");
		pstmt.setString(3, "abc@gmail.com");

		int insertStatus = 0;
		insertStatus = pstmt.executeUpdate();   //executing the query

		if (insertStatus != 0)
			System.out.println("One Row Inserted Successfully!!!!");  //displaying insert status

		pstmt.close();
		connection.close();
	}

}
