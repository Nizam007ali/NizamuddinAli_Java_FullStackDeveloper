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
public class J009InputCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Circle : ");    
        System.out.println("=================================================="); 
        System.out.print("Enter radius : ");     
        float r = sc.nextFloat();  
        System.out.println("==================================================");
        System.out.println(" Radius of Circle : "+r+" | Circumference : "+(r*2*22/7)+" | Area : "+(r*r*22/7));
    }
}
