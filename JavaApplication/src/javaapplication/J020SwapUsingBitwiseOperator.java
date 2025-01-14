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
public class J020SwapUsingBitwiseOperator {
    public static void main(String[] args) {
        int a = 107;        
        int b = 92;         
        System.out.println("==Before swapping=================================");
        System.out.println("a : "+a);       //0110 1011
        System.out.println("b : "+b);       //0101 1100
        a=a^b;                              //0011 0111
        b=a^b;                              //0101 1100
        a=a^b;                              //0110 1011
        System.out.println("==After swapping==================================");
        System.out.println("a : "+a);       //0110 1011
        System.out.println("b : "+b);       //0101 1100
        System.out.println("==================================================");
    }
}
