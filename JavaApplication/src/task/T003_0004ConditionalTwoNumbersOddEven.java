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
public class T003_0004ConditionalTwoNumbersOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("======take tow number and out sum odd or even=====");
        System.out.println("==================================================");
        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();
        int n = n1 + n2;
        System.out.println("==================================================");
        if(n%2==0) {
            System.out.println("Sum of number is even.");
        } else {
            System.out.println("Sum of number is odd.");
        } 
        System.out.println("==================================================");
    }
}
