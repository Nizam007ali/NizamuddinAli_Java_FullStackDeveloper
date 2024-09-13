package jdbc;
import java.sql.*;

public class insert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/git", "root", "1234");
    
        Statement stmt = conn.createStatement();
        
        int id = 1, r;
        String n = "nizam";
        
        r = stmt.executeUpdate("insert into student values('"+id+"','"+n+"')");
        if(r>0) System.out.println("row 1 inserted");
        else System.out.println("row 1 not inserted");
        
        int[] id1 = {2 , 3 , 4 , 5};
        String[] n1 = {"Manu","Monu","sonu","tonu"};
        for(int i=0;i<4;i++){
            r = stmt.executeUpdate("insert into student values('"+id1[i]+"','"+n1[i]+"')");
            if(r>0) System.out.println("row "+(i+2)+" inserted ");
            else System.out.println("row "+(i+2)+" not inserted "); 
        }

        conn.close();
        
    }
}
