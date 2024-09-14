package java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class readFileUsingScanner {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new FileInputStream("C:/Users/nizam/OneDrive/Documents/NetBeansProjects/hello/demo2.txt"));
        String s = "";
        try {
            while (true) {
                s = sc.nextLine();
                System.out.println("" + s);
            }
        } catch (NoSuchElementException e) {
            System.out.println("_____________________________________-");
        }

    }

}
