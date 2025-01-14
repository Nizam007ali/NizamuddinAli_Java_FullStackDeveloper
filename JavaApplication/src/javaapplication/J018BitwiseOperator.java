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
public class J018BitwiseOperator {
    public static void main(String[] args) {
        int a = 0;        
        int b = 1;         
        System.out.println("==================================================");
        System.out.println("Bitwise Operator");
        System.out.println("==And Operator====================================");
        System.out.println("0 & 0 : "+(a&a));       
        System.out.println("0 & 1 : "+(a&b));       
        System.out.println("1 & 0 : "+(b&a));       
        System.out.println("1 & 1 : "+(b&b));       
        System.out.println("==Or  Operator====================================");
        System.out.println("0 | 0 : "+(a|a));       
        System.out.println("0 | 1 : "+(a|b));       
        System.out.println("1 | 0 : "+(b|a));       
        System.out.println("1 | 1 : "+(b|b));       
        System.out.println("==Not Operator====================================");
        System.out.println("~0 : "+(~a));       
        System.out.println("~1 : "+(~b));       
        System.out.println("==Xor Operator====================================");
        System.out.println("0 ^ 0 : "+(a^a));       
        System.out.println("0 ^ 1 : "+(a^b));       
        System.out.println("1 ^ 0 : "+(b^a));       
        System.out.println("1 ^ 1 : "+(b^b));     
        System.out.println("==Left shift Operator=============================");
        System.out.println("1<<2 : "+(b=b<<2));      
        System.out.println("4<<1 : "+(b=b<<1));      
        System.out.println("==Right shift Operator============================");
        System.out.println("8>>2 : "+(b=b>>2));      
        System.out.println("2>>1 : "+(b=b>>1));      
        System.out.println("==================================================");
    }
}
