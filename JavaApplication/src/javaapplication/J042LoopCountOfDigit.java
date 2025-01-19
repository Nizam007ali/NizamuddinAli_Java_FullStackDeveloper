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
public class J042LoopCountOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("=============Count of Digit of Number=============");
        System.out.println("==================================================");
        System.out.print("Enter number : ");
        int n = sc.nextInt(), c = 0;
        for(int i=n; i>0;i/=10) {
            int r = i%10;
            c++;
        }
        System.out.println("Number : "+n);
        System.out.println("Count of digits : "+c);
        System.out.println("==================================================");
    }
}
