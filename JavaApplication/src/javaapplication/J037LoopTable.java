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
public class J037LoopTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("=====================--Table======================");
        System.out.println("==================================================");
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        for(int i=1; i<=10;i++) {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
        System.out.println("");
        System.out.println("==================================================");
    }
}
