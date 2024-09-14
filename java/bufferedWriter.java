package java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedWriter {
    
    public static void main(String[] args) throws IOException {
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/nizam/OneDrive/Documents/NetBeansProjects/hello/demo2.txt"));
        String str = "hello World!";
        bw.write(str);
        bw.close();
        System.out.println("data written using buffered writer");
        
    }
    
}
