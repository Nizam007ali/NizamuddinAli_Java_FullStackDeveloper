package java;

import java.io.File;

public class filehandlingCreateDirectory {

    public static void main(String[] args) {
        
        File dir = new File("C:/Users/nizam/OneDrive/Documents/NetBeansProjects/hello/src/git/Bhopal");
        
        if (dir.mkdir()) {
            System.out.println("Directory created");
        } else {
            System.out.println("Directory not created");
        }
        
    }
    
}
