package java;

import java.util.Scanner;

public class exception002 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int s = 0;
        
        try {
            System.out.print("Enter value of power : ");
            s = sc.nextInt();
        } catch (Exception e) {
            System.out.println("enter integer");
        } finally {
            System.out.println(Math.pow(2, s));;
        }

    }
}
