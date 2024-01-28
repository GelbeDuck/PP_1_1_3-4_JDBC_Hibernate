package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
//    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://@localhost:3306/mysql";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root_555742";

    private static Connection connection;

//    private Util() {
//
//    }

    public static Connection getConnection() {
        if (connection == null) {
//            try {
//                Class.forName(DB_DRIVER);
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
            try {
                connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                System.out.println("Соединение с БД успешено установлено");
            } catch (SQLException e) {
                System.out.println("Соединение с БД не установлено");
            }
        }
        return connection;
    }
}
