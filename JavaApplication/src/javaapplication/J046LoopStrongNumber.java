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
public class J046LoopStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("===================Strong Number==================");
        System.out.println("==================================================");
        System.out.print("Enter number : ");
        int n = sc.nextInt(), sum = 0;
        for(int i=n; i>0;i/=10) {
            int r = i%10, fact = 1;
            for(int j=r; j>=1; j--) {
                fact*=j;
            }
            sum+=fact;
        }
        if(sum==n) System.out.println("Number is Strong number.");
        else System.out.println("Number is not Strong number.");
        System.out.println("==================================================");
    }
}
