package com.satishlabs;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ImageRetrieve {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/learnkarts";
        String user = "root";
        String password = "root";

        String selectQuery = "SELECT image FROM images WHERE id = ?";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = con.prepareStatement(selectQuery)) {

            pstmt.setInt(1, 1);  // Retrieve image with ID = 1
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                InputStream is = rs.getBinaryStream("image");
                FileOutputStream fos = new FileOutputStream("G:/Altimetrik/Coursera-labs/Spring Boot Upskilling Path/Advanced Java/retrieved_image.jpg");

                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = is.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }

                fos.close();
                System.out.println("Image retrieved and saved as 'retrieved_image.jpg'");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

