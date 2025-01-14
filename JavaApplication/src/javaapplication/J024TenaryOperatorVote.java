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
public class J024TenaryOperatorVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eligible to vote");
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        String res = age>0&&age<=120 ? (age>=18?"You are eligible to vote.":"You are not eligible to vote.") : "Enter valid age between 0 to 120.";
        System.out.println("==================================================");
        System.out.println("Your age is " + age + ".");
        System.out.println(res);
        System.out.println("==================================================");
    }
}
