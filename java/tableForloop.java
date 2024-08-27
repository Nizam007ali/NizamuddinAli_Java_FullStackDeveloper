public package git;

import java.util.Scanner;

public class tableForloop {
    public static void main(String str[]) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to get table of that number : ");
        n = s.nextInt();
        for(int i = 0; i < 10; i++){
            System.out.println(n+" * "+(i+1)+" = "+(n*(i+1)));
        }
    }
}

