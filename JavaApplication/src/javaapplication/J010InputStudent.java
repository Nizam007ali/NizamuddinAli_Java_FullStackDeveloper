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
public class J010InputStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student : ");    
        System.out.println("=================================================="); 
        System.out.print("Enter Name : ");     
        String n = sc.next(); 
        System.out.print("Enter RollNumber : ");    
        String r = sc.next();    
        System.out.print("Enter marks of Maths: ");     
        int m = sc.nextInt(); 
        System.out.print("Enter marks of Physics: ");     
        int p = sc.nextInt(); 
        System.out.print("Enter marks of Chemistry: ");     
        int c = sc.nextInt(); 
        System.out.print("Enter marks of English: ");     
        int e = sc.nextInt(); 
        System.out.print("Enter marks of Hindi: ");     
        int h = sc.nextInt(); 
        System.out.println("==================================================");
        System.out.println("Student Name : " + n);     
        System.out.println("Roll Number : " + r);     
        System.out.println("Subject Marks : Maths - " + m + "| Physics - " + p + "| Chemistry - " + c + "| Hindi - " + h + "| English - " + e );  
        float t = m + p + c + h + e;
        System.out.println("Total Marks : " + t ); 
        float per = t/5;
        System.out.println("Percentage : " + per ); 
    }
}
