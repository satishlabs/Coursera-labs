package com.satishlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connectivity {
	public static void main(String[] args) {
		System.out.println("Table creation Example!");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
			try {
				Statement st = con.createStatement();
				
				String query = "CREATE TABLE login(username varchar(20), password varchar(20))";
				st.execute(query);
				System.out.println("Table creation process successfully!");
			}catch (SQLException e) {
				System.out.println("Table all ready exists!");
			}
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
