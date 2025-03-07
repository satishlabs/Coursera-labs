package com.satishlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnnectProgram {
    public static void main(String[] args) {
        System.out.println("Table Example");

        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/learnkarts";
        String user = "root";
        String password = "root";

        // SQL query to create the table
       /* String query = "CREATE TABLE IF NOT EXISTS login (" +
                       "username VARCHAR(20), " +
                       "password VARCHAR(20))";*/
       // String query = "insert into login values('Satish','Prasad')";
        System.out.println("New User Details to be inserted");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name and password");
        String uname = sc.next();
        String pass = sc.next();
        
        String query = "insert into login values(?,?)";
        
        

        // Try-with-resources to ensure automatic closing
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement st = con.createStatement()) {
             
            // Load MySQL driver (not required in modern JDBC versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Execute update instead of query
          //  st.executeUpdate(query);
           // System.out.println("Table created successfully...");
          //  System.out.println("Record Inserted successfully...");
            
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, uname);
            ps.setString(2, pass);
            System.out.println("User created");
            

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQL Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
        }
    }
}
