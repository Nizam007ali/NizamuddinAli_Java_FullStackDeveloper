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
public class J017LogicalOperator {
    public static void main(String[] args) {
        boolean t = true;
        boolean f = false;
        System.out.println("==================================================");
        System.out.println("Logical Operator");
        System.out.println("==And Operator====================================");
        System.out.println("t && t : "+(t&&t));
        System.out.println("t && f : "+(t&&f));
        System.out.println("f && t : "+(f&&t));
        System.out.println("f && f : "+(f&&f));
        System.out.println("==Or Operator=====================================");
        System.out.println("t || t : "+(t||t));
        System.out.println("t || f : "+(t||f));
        System.out.println("f || t : "+(f||t));
        System.out.println("f || f : "+(f||f));
        System.out.println("==================================================");
    }
}
