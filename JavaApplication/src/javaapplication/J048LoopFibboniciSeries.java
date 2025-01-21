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
public class J048LoopFibboniciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("=================Fibbonici Series=================");
        System.out.println("==================================================");
        System.out.print("Enter number : ");
        int n = sc.nextInt(), a = 0, b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 0; i < n-2; i++) {
            int temp = b;
            b = b + a;
            a = temp;
            System.out.print(b + " ");
        }
        System.out.println("==================================================");
    }
}
