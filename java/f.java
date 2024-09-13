package java;

import java.io.File;
import java.io.IOException;

public class filehandlingCreateFile {
    
    public static void main(String[] args) throws IOException {
        
        File f = new File("C:/Users/nizam/OneDrive/Documents/NetBeansProjects/hello/src/git/Bhopal/abc.txt");
        if(f.createNewFile()) System.out.println("File created");
        else System.out.println("File not created");
        
    }
    
}
