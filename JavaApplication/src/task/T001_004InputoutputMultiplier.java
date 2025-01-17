/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;

import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class T001_004InputoutputMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        System.out.println("==================================================");
        System.out.println("====================Multiplier====================");
        System.out.println("==================================================");
        System.out.print("Enter first numbers : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second numbers : ");
        int n2 = sc.nextInt();
        if(n1>n2){
            if(n1%n2==0)
                result="n2 is Multiplier of n1";
            else
                result="Not multiplier of each other";
        } else if(n2>n1){
            if(n2%n1==0)
                result="n1 is Multiplier of n2";
            else
                result="Not multiplier of each other";
        }
        System.out.println("==================================================");
        System.out.println("Numbers you entered are "+n1+", "+n2+".");
        System.out.println(result+".");
        System.out.println("==================================================");
    }
}
