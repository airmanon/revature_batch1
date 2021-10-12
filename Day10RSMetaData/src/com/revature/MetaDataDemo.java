package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetaDataDemo {
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	ResultSetMetaData rsmd = null;
	Scanner input = new Scanner(System.in);

	public void getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/revature", "root", "root");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void getAll(String tableName) {
		try {
			stmt = conn.createStatement();
			String query = "select * from " + tableName;
			rs = stmt.executeQuery(query);
			rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.print("\n");
			while (rs.next()) {
				for (int i = 1; i <= columnCount; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.print("\n");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void getById(String tableName, int id) {
		try {
//			stmt = conn.createStatement();
//			String query = "select * from " + tableName + " where id=" + id;
			String query1 = "select * from ? where id = ?";
			pstmt = conn.prepareStatement(query1);
			pstmt.setString(1, tableName);
			pstmt.setInt(2, id);
			rs = pstmt.executeQuery();
			rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.print("\n");
			if (rs.next()) {
				for (int i = 1; i <= columnCount; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.print("\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public void deleteById(String tableName, int id) {
		try {
			stmt = conn.createStatement();
			String query = "delete from " + tableName + " where id=" + id;
			stmt.executeUpdate(query);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void insert(String tableName) {
		List<String> columnNames = new ArrayList<String>();
		List<String> columnValues = new ArrayList<String>();
		StringBuffer insertQuery = new StringBuffer("insert into ");
		insertQuery.append(tableName).append(" (");
		try {
			stmt = conn.createStatement();
			String query = "select * from " + tableName;
			rs = stmt.executeQuery(query);
			rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			StringBuffer columns = new StringBuffer("");
			int i = 0;
			String columnName = null;
			String value = null;
			for (i = 1; i < columnCount; i++) {
				columnName = rsmd.getColumnName(i);
				columnNames.add(columnName);
				columns.append(columnName).append(",");
				System.out.print("Enter for " + columnName + ":");
				value = input.next();
				columnValues.add(value);
			}
			columnName = rsmd.getColumnName(i);
			columnNames.add(columnName);
			columns.append(columnName).append(") values (");
			System.out.print("Enter for " + columnName + ":");
			value = input.next();
			columnValues.add(value);
			for (i = 1; i < columnCount; i++) {
				if (i == 1)
					columns.append(columnValues.get(0) + ",");
				else
					columns.append("'"+columnValues.get(i - 1) + "',");
			}
			columns.append("'" + columnValues.get(i - 1) + "');");
			insertQuery.append(columns);

			System.out.println("insertQuery =" + insertQuery);
			pstmt = conn.prepareStatement(insertQuery.toString());
//			pstmt.setString(1, tableName);
			System.out.println("column values :" + columnValues);
//			for (i = 2; i <= columnCount+1; i++) {
//				pstmt.setString(i, columnValues.get(i-2));
//			}
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetaDataDemo obj = new MetaDataDemo();
		try {
			obj.getConnection();
			obj.getAll("employee");

			obj.insert("employee");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
