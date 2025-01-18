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
public class J034SwitchCalculator {
    public static void main(String[] args) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("Calculator");
        System.out.println("==================================================");
        System.out.print("Enter number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int n2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter operation you want to perform :\n"
                + "\t+\n\t-\n\t*\n\t/\n\t%\n ");
        char ch = sc.nextLine().charAt(0);
        switch(ch){
            case '+' :
                result = ""+n1+" "+ch+" "+n2+" = "+(n1+n2);
                break;
            case '-' :
                result = ""+n1+" "+ch+" "+n2+" = "+(n1-n2);
                break;
            case '*' :
                result = ""+n1+" "+ch+" "+n2+" = "+(n1*n2);
                break;
            case '/' :
                result = ""+n1+" "+ch+" "+n2+" = "+(n1/n2);
                break;
            case '%' :
                result = ""+n1+" "+ch+" "+n2+" = "+(n1%n2);
                break;
            default:
                result = "Enter a Valid choice";
                break;
        }
        System.out.println(result);
    }
}
