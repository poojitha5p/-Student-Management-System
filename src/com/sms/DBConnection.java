package com.sms;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db", "root", "your_password");
        } catch (Exception e) {
            System.out.println("DB Connection Error: " + e);
            return null;
        }
    }
}