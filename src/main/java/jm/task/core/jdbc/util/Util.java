package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/myDbtest";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "rootroot";

    public static Connection getConnection () {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            System.out.println("Connection OK");
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Connection ERROR");
        }
        return connection;
    }




}
