package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBUpdate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver"); // loading & registering the driver

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/revature", "root", "root"); // establishing connection
																														

		String updateQuery = "UPDATE `employee` SET `name` = ?,`email` = ? WHERE `id` = ?;"; // creating a query
		PreparedStatement pstmt = connection.prepareStatement(updateQuery); // creating prepared Statement
		pstmt.setInt(3, 100);
		pstmt.setString(1, "abc123");
		pstmt.setString(2, "abc123@gmail.com");

		int updateStatus = 0;
		updateStatus = pstmt.executeUpdate();   //executing the query

		if (updateStatus != 0)
			System.out.println("One Row Updated Successfully!!!!");  //displaying insert status

		pstmt.close();
		connection.close();
	}

}
