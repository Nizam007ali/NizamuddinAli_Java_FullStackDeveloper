/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class J039LoopFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("=====================Factorial====================");
        System.out.println("==================================================");
        System.out.print("Enter number : ");
        int n = sc.nextInt(), fact = 1;
        for(int i=n; i>=1;i--) {
            fact*=i;
        }
        System.out.println("factorial of "+n+" is "+fact);
        System.out.println("==================================================");
    }
}
