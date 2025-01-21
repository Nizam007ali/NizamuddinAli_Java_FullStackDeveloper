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
public class J047LoopPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("===================Prime Number===================");
        System.out.println("==================================================");
        System.out.print("Enter number : ");
        int n = sc.nextInt(), c = 0;
        boolean p = false;
        for(int i=2; i<n;i++) {
            c = 0;
            if(n%i==0){
                c++;
                break;
            }
        }
        if(c==1) System.out.println("Number is not Prime number.");
        else System.out.println("Number is Prime number.");
        System.out.println("==================================================");
    }
}
