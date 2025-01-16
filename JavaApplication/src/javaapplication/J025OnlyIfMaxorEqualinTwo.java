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
public class J025OnlyIfMaxorEqualinTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Max or Equal in Two numbers.");
        System.out.print("Enter First number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second number : ");
        int n2 = sc.nextInt();
        System.out.println("==================================================");
        System.out.println("First number " + n1 + ".");
        System.out.println("Second number " + n2 + ".");
        if(n1>n2) {
            System.out.println("First if executed");
            System.out.println("Number "+n1+" is greater than "+n2+".");
        }
        if(n1<n2) {
            System.out.println("Second if executed");
            System.out.println("Number "+n2+" is greater than "+n1+".");
        }
        if(n1==n2) {
            System.out.println("Third if executed");
            System.out.println("Both numbers are equals");
        }
        System.out.println("==================================================");
    }
}
