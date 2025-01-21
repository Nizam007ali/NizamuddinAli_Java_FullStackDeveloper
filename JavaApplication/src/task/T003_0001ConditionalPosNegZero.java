/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;

import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class T003_0001ConditionalPosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("========take a number and out pos neg zero=========");
        System.out.println("==================================================");
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("==================================================");
        if(n==0) {
            System.out.println("Number is zero.");
        } else if(n>0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is negative.");
        }
        System.out.println("==================================================");
    }
}
