package java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReader {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/nizam/OneDrive/Documents/NetBeansProjects/hello/demo2.txt"));
        String s = "", r;
        while((r = br.readLine())!=null){
            s = s+ "\n" + r;
        }
        System.out.println(s);
        
    }
    
}
