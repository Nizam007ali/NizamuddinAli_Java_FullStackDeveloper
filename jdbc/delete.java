package jdbc;

import java.sql.*;

public class delete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cyindb","root","1234");
    
        Statement stmt = conn.createStatement();
        
        int id = 5, r;
        r = stmt.executeUpdate("delete from student where id = '"+id+"' ");
        
        if(r>0) System.out.println("row deleted");
        else System.out.println("row not deleted");
        
        conn.close();
    }
}
