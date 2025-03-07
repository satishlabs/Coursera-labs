package com.satishlabs;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class JdbcRowSetExample {
    public static void main(String[] args) {
        try (JdbcRowSet jrs = RowSetProvider.newFactory().createJdbcRowSet()) {
            jrs.setUrl("jdbc:mysql://localhost:3306/learnkarts");
            jrs.setUsername("root");
            jrs.setPassword("root");
            jrs.setCommand("SELECT id, fn, ln FROM employee");
            jrs.execute();

            // Iterate and print results
            while (jrs.next()) {
                System.out.println("ID: " + jrs.getInt("id") + ", fn: " + jrs.getString("fn")+ ", ln: " + jrs.getString("ln"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

