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
public class J027ifelseEvenOdd {
    public static void main(String[] args) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        if(n%2==0){
            result = "Even number";
        } else {
            result = "Odd number";
        }
        System.out.println("Even Or Odd");
        System.out.println("==================================================");
        System.out.println("Number you entered is " + n + " and it is an " + result + ".");
    }
}
