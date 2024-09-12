package jdbc;

import java.sql.*;

public class createDatabase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "1234");

        Statement stmt = conn.createStatement();

        int r;
        r = stmt.executeUpdate("create database git;");
        if (r > 0)
            System.out.println("Database created.");
        else
            System.out.println("Database not created.");

        r = stmt.executeUpdate("drop database git");
        if (r == 0)
            System.out.println("Database deleted.");
        else
            System.out.println("Database not deleted.");

        conn.close();

    }
}
