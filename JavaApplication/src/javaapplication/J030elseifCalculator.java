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
public class J030elseifCalculator {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("Basic Calculator");
        System.out.println("==================================================");
        System.out.print("Enter number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Choose + - * / : ");
        char c = sc.nextLine().charAt(0);
        System.out.print("Enter number 2 : ");
        int n2 = sc.nextInt();
        if(c=='+'){
            System.out.println(n1+n2);
        } else if(c=='-') {
            System.out.println(n1-n2);
        } else if(c=='*') {
            System.out.println(n1*n2);
        } else if(c=='/'){
            System.out.println(n1/n2);
        } else{
            System.out.println("Enter correct choice");
        }
    }
}
