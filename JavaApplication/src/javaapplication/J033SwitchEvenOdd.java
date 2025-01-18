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
public class J033SwitchEvenOdd {
    public static void main(String[] args) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("Even Odd");
        System.out.println("==================================================");
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        switch(n%2){
            case 0 :
                result = "it's an even";
                break;
            case 1 :
                result = "it's an odd";
                break;
            default:
                result = "Enter a number";
                break;
        }
        System.out.println(result);
    }
}
