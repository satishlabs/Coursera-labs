package com.satishlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoUpdateRecords {
	static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
	static final String USER = "root";
	static final String PASS = "root";
	static final String QUERY = "SELECT EmployeeId, Name, Department FROM employees"; // Include Department column
	
	public static void main(String[] args) throws SQLException {
		try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
		     Statement stmt = con.createStatement()) {
			
			// Corrected SQL query with proper spacing
			String sql = "UPDATE EMPLOYEES SET Department = 'EC' WHERE EmployeeId IN (4)";
			int rowsUpdated = stmt.executeUpdate(sql);
			System.out.println(rowsUpdated + " row(s) updated.");
			
			// Retrieve updated records
			ResultSet rs = stmt.executeQuery(QUERY);
			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("EmployeeId") + 
				                   ", Name: " + rs.getString("Name") + 
				                   ", Department: " + rs.getString("Department"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
