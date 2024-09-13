package jdbc;
import java.sql.*;

public class update {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/git","root","1234");
    
        Statement stmt = conn.createStatement();
        
        String n = "nitish";
        int i = 2;
        int r = stmt.executeUpdate("update student set name='"+n+"' where id = '"+i+"'");
        if(r>0) System.out.println("Update done");
        else System.out.println("Update not done");
        
    }
}
