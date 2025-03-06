package com.satishlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoDeleteRecords {
    static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    static final String USER = "root";
    static final String PASS = "root";
    static final String QUERY = "SELECT EmployeeId, Name, Department FROM employees";

    public static void main(String[] args) throws SQLException {
        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = con.createStatement()) {
             
            // Corrected DELETE query with space
            String sql = "DELETE FROM EMPLOYEES WHERE EmployeeId = 1";
            int rowsDeleted = stmt.executeUpdate(sql);
            System.out.println(rowsDeleted + " row(s) deleted.");
            
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
