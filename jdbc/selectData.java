package jdbc;

import java.sql.*;

public class select {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cyindb", "root", "1234");

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("Select * from student;");

        while (rs.next()) {
            System.out.println("id : " + rs.getInt("id") + " \t name : " + rs.getString("name"));
        }

        System.out.println("_______________________________________________");
        System.out.println("specific data");
        int id = 2;
        rs = stmt.executeQuery("select * from student where id = '" + id + "'");
        if(rs.next())System.out.println("id : " + rs.getInt("id") + " name : " + rs.getString("name"));

    }
}
