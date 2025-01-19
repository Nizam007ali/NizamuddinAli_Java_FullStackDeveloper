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
public class J040LoopPerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("==================Perfect Number==================");
        System.out.println("==================================================");
        System.out.print("Enter number : ");
        int n = sc.nextInt(), sum = 0;
        for(int i=1; i<=n/2;i++) {
            if(n%i==0) sum+=i;
        }
        if(n==sum) System.out.println(n+" is perfect number,");
        else System.out.println(n+" is not perfect number,");
        System.out.println("==================================================");
    }
}
