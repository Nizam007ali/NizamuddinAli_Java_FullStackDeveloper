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
public class J041LoopSumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("==============Sum of Digit of Number==============");
        System.out.println("==================================================");
        System.out.print("Enter number : ");
        int n = sc.nextInt(), sum = 0;
        for(int i=n; i>0;i/=10) {
            int r = i%10;
            sum=sum+r;
        }
        System.out.println("Number : "+n);
        System.out.println("Sum of digits : "+sum);
        System.out.println("==================================================");
    }
}
