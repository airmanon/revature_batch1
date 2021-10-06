package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBDelete {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver"); // loading & registering the driver

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/revature", "root", "root"); // establishing connection
																														

		String deleteQuery = "DELETE FROM `revature`.`employee` WHERE `id`=?;"; // creating a query
		PreparedStatement pstmt = connection.prepareStatement(deleteQuery); // creating prepared Statement
		pstmt.setInt(1, 100);
	
		int deleteStatus = 0;
		deleteStatus = pstmt.executeUpdate();   //executing the query

		if (deleteStatus != 0)
			System.out.println("One Row deleted Successfully!!!!");  //displaying delete status

		pstmt.close();
		connection.close();
	}

}
