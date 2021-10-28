package com.revature.coursemgmt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.coursemgmt.model.Student;

public class StudentDAO {

	private static Connection conn = null;
	private static Statement stmt = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null;

	public static List<Student> readAll() {
		List<Student> students = new ArrayList<Student>();
		String query = "select * from student";
		connect();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				Student stu = new Student();
				stu.setId(rs.getInt("id"));
				stu.setName(rs.getString("name"));
				stu.setEmail(rs.getString("email"));
				stu.setMobile(rs.getLong("mobile"));
				stu.setCourseId(rs.getInt("course_id"));
				students.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return students;
	}

	public static Student readById(int id) {
		Student stu = new Student();
		String query = "select * from student where id=" + id;
		connect();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				stu.setId(rs.getInt("id"));
				stu.setName(rs.getString("name"));
				stu.setEmail(rs.getString("email"));
				stu.setMobile(rs.getLong("mobile"));
				stu.setCourseId(rs.getInt("course_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return stu;
	}

	public static void save(Student student) {
		String query = "insert into student (name,email,mobile,course_id) values (?,?,?,?)";
		connect();
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getEmail());
			pstmt.setLong(3, student.getMobile());
			pstmt.setInt(4, student.getCourseId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
	}
	
	public static void update(int id,Student student) {
		
		String query = "update student set name=?, email=?, mobile=?, course_id=? where id=?";
		connect();
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getEmail());
			pstmt.setLong(3, student.getMobile());
			pstmt.setInt(4, student.getCourseId());
			pstmt.setInt(5, id);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
	}
	
	public static void delete(int id) {
		String query = "delete from student where id="+id;
		connect();
		try {
			stmt=conn.createStatement();
			stmt.executeUpdate(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
	}

	public static Connection connect() {
		String dbUrl = "jdbc:mysql://localhost:3306/demo";
//		String dbUrl = "jdbc:postgres://localhost:5432/demo";
		try {
			conn = DriverManager.getConnection(dbUrl, "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close() {

		try {
			if (conn != null)
				conn.close();
			if (stmt != null)
				stmt.close();
			if (pstmt != null)
				pstmt.close();
			if (rs != null)
				rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
