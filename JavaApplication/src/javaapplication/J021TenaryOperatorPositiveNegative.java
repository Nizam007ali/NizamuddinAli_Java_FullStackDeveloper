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
public class J021TenaryOperatorPositiveNegative {
    public static void main(String[] args) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        result = n>=0 ? "Positive number" : "Negative number";
        System.out.println("Negative Or Positive");
        System.out.println("==================================================");
        System.out.println("Number you entered is " + n + " and it is a " + result + ".");
    }
}
