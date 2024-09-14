package java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReaderInputStreamReader {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("id : ");
        String id = br.readLine();
        System.out.print("name : ");
        String name = br.readLine();
        System.out.print("email : ");
        String email = br.readLine();
        System.out.print("percentage : ");
        String per = br.readLine();
        System.out.println("1. id : "+id+"\n2. name : "+name+"\n3. email : "+email+"\n4. percentage : "+per);
        
    }
    
}