package main.java.proiect.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection;

    private DatabaseConnection() {
    }

    public static Connection getInstance() throws SQLException {
        if (connection == null) {
            String url = "jdbc:mysql://localhost:3306/pao";
            String userName = "root";
            String password = "Admin01pa55";

            connection = DriverManager.getConnection(url, userName, password);
        }
        System.out.println("Successfully connected to database");
        return connection;
    }
}