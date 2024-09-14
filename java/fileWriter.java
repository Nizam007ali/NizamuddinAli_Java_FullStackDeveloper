package java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileWriter {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("C:/Users/nizam/OneDrive/Documents/NetBeansProjects/hello/demo1.txt", true);
        String str = sc.nextLine();
        fw.write(str);
        fw.close();
        
    }
}
