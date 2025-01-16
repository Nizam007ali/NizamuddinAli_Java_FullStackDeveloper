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
public class J026ifelseVote {
    public static void main(String[] args) {
        String res = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Eligible to vote.");
        System.out.print("Enter age : ");
        int a = sc.nextInt();
        System.out.println("==================================================");
        System.out.println("Your age is " + a + ".");
        if( a>=18 && a<=120 ) {
            System.out.println("if executed");
            System.out.println("You are eligble to vote.");
        } else {
            System.out.println("else executed");
            System.out.println("You are not eligble to vote.");
        }
        System.out.println("==================================================");
    }
}
