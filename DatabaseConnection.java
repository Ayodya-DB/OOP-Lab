package tasktracker;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/tasktracker",
                    "root",
                    "");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}