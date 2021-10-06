package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBRead {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//	1) Driver (MySQL Driver, Oracle Driver, PostgresDriver)
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Driver d = new com.mysql.cj.jdbc.Driver();
		//	2) Establishing the connection between Java & DB Server  (Connection [I])  - connection url, username, password
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/revature", "root", "root");
		
		//	3) Creating & running query (Statement/PreparedStatement/CallableStatement) [I]
		String query = "select * from employee";
		Statement stmt = connection.createStatement();
		//	4) Storing & Processing the Result (ResultSet[I])
		ResultSet rs =  stmt.executeQuery(query);
		System.out.println("ID \t Name \t\t Email");
		while(rs.next()) {
			System.out.println(rs.getInt("id") + "\t" + rs.getString(2)+"\t \t" + rs.getString(3));
		}
		
		//	5) close all the resources
		rs.close();
		stmt.close();
		connection.close();
		
	}

}
