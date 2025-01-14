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
public class J023TenaryOperatorGreatestInTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Max in Two numbers");
        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();
        int max = n1>n2 ? n1 : n2;
        System.out.println("==================================================");
        System.out.println("First Number is " + n1 + ".");
        System.out.println("Second Number is " + n2 + ".");
        System.out.println("==================================================");
        System.out.println("Maximum number is " + max + ".");
    }
}
