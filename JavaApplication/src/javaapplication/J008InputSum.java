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
public class J008InputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Additon : ");    
        System.out.println("=================================================="); 
        System.out.print("Enter first number : ");     
        int n1 = sc.nextInt(); 
        System.out.print("Enter second number : ");    
        int n2 = sc.nextInt();   
        System.out.println("==================================================");
        System.out.println(" A : "+n1+" | B : "+n2+" | Sum : "+(n1+n2));
    }
}
