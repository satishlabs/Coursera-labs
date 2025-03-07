package com.satishlabs;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImageInsert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/learnkarts";  
        String user = "root";
        String password = "root";

        String insertQuery = "INSERT INTO images (name, image) VALUES (?, ?)";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = con.prepareStatement(insertQuery)) {

            // Specify the image file path
            File image = new File("G:/Altimetrik/Coursera-labs/Spring Boot Upskilling Path/Advanced Java/image.jpg");  // Change to actual image path
            FileInputStream fis = new FileInputStream(image);

            // Set values
            pstmt.setString(1, image.getName());  // Image name
            pstmt.setBinaryStream(2, fis, (int) image.length());  // Image as binary stream

            // Execute the query
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Image inserted successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
