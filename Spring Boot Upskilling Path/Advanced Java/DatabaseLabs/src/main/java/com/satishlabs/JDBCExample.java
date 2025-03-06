package com.satishlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
	static final String USER = "root";
	static final String PASS = "root";
	static final String QUERY = "SELECT EmployeeId, Name FROM employees";

	public static void main(String[] args) throws SQLException {
		try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
		     Statement stmt = con.createStatement();
		     ResultSet rs = stmt.executeQuery(QUERY)) {
			
			// Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				System.out.println("ID: " + rs.getInt("EmployeeId"));
				System.out.println("Name: " + rs.getString("Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
