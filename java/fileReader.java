package java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader fr = new FileReader("C:/Users/nizam/OneDrive/Documents/NetBeansProjects/hello/demo1.txt");
        String s = "";
        int r = 0;
        while (true) {
            r = fr.read();
            if (r == -1) {
                break;
            }
            s = s + (char) r;
        }
        System.out.println(s);

    }

}
