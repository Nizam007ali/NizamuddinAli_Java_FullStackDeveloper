package java;

import java.io.File;
import java.io.IOException;

public class fileinsideDirectory {
    
    public static void main(String[] args) throws IOException {
         
        File f1 = new File("Bhopal", "xyz.text");       //  directory must exist
        
        if(f1.createNewFile()) System.out.println("file created inside directory");
        else System.out.println("file not created inside directory");

    }

}
