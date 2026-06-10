package com.mycompany.labsheet8;

import java.sql.Connection;
import java.sql.SQLException;

public class StudentConnectionTest {
    public static void main(String[] args) {
        try (Connection conn = StudentDatabaseConnection.getConnection()) {
            System.out.println("Database connected successfully.");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}