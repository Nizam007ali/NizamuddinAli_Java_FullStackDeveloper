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
public class J043LoopSumOfEvenDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("=============sum of even Digit Number=============");
        System.out.println("==================================================");
        System.out.print("Enter number : ");
        int n = sc.nextInt(), s = 0;
        for(int i=n; i>0;i/=10) {
            int r = i%10;
            if(r%2==0) s+=r;
        }
        System.out.println("Number : "+n);
        System.out.println("Sum of even digits : "+s);
        System.out.println("==================================================");
    }
}
