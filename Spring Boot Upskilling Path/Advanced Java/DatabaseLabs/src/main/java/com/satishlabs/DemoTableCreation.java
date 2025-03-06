package com.satishlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoTableCreation {
	static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
		     Statement stmt = con.createStatement()) {
			
			// Corrected SQL statement
			String sql = "CREATE TABLE EMP_DETAIL ("
					+ "id INTEGER NOT NULL, "
					+ "first VARCHAR(255), "
					+ "last VARCHAR(255), "
					+ "age INTEGER, "
					+ "PRIMARY KEY (id))";  // Fixed missing closing parenthesis

			stmt.execute(sql);
			System.out.println("Table created in the given database ....");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
