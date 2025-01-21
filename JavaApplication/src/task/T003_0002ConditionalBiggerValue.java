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
public class T003_0002ConditionalBiggerValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("==========take two number and out big one=========");
        System.out.println("==================================================");
        System.out.print("Enter a 1 number : ");
        int m = sc.nextInt();
        System.out.print("Enter a 2 number : ");
        int n = sc.nextInt();
        System.out.println("==================================================");
        if(n>m) {
            System.out.println("2 Number is greater.");
        } else if(m>n) {
            System.out.println("1 Number is greater.");
        } else {
            System.out.println("Both are equals.");
        } 
        System.out.println("==================================================");
    }
}
