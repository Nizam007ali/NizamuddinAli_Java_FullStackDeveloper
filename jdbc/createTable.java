package jdbc;

import java.sql.*;

public class createTable {
    public static void main(String str[]) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cyindb", "root", "1234");

        Statement stmt = conn.createStatement();

        stmt.executeUpdate("create table student(id int, name varchar(20));");
        System.out.println("table created");
        stmt.executeUpdate("drop table student;");
        System.out.println("table deleted");

        conn.close();

    }
}
