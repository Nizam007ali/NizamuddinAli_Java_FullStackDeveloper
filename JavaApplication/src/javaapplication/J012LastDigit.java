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
public class J012LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digit : ");
        int d = sc.nextInt();
        int ld = d%10;
        System.out.println("==================================================");
        System.out.println("Digit : "+ d);
        System.out.println("Last digit : "+ ld);
        System.out.println("==================================================");
    }
}
