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
public class J019BitwiseOperatorExa {
    public static void main(String[] args) {
        int a = 107;        
        int b = 92;         
        System.out.println("==================================================");
        System.out.println("a : "+a);       //0110 1011
        System.out.println("b : "+b);       //0101 1100
        System.out.println("==================================================");
        System.out.println("Bitwise Operator");
        System.out.println("==And Operator====================================");
        System.out.println("a & b : "+(a&b));       //0100 1000
        System.out.println("==Or  Operator====================================");
        System.out.println("a | b : "+(a|b));       //0111 1111
        System.out.println("==Not Operator====================================");
        System.out.println("~a : "+(~a));       
        System.out.println("~b : "+(~b));       //0111 1111
        System.out.println("==Xor Operator====================================");
        System.out.println("a ^ b : "+(a^b));       //0011 0111
        System.out.println("==Left shift Operator=============================");
        System.out.println("a<<1 : "+(a<<1));       //0110 1011 => 1101 0110
        System.out.println("==Right shift Operator============================");
        System.out.println("b>>2 : "+(b>>2));       //0101 1100 => 0001 0111
        System.out.println("==================================================");
    }
}
