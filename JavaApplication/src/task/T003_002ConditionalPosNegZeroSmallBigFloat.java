/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;

import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class T003_002ConditionalPosNegZeroSmallBigFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("========take a number and out pos neg zero=========");
        System.out.println("==================================================");
        System.out.print("Enter a number : ");
        float n = sc.nextFloat();
        String c1="",c2="";
        System.out.println("==================================================");
        if(n==0) {
            c1="zero";
        } else if(n>0) {
            c1="positive";
        } else {
            c1="negative";
        }
        float m = n;
        if(m<0)m=-m;
        if(m>=0 && m<1) {
            c2=" small";
        } else if(m>=10000000) {
            c2=" large";
        } else {
            c2="";
        } 
        System.out.println("Number is"+c2+" "+c1+".");
        System.out.println("==================================================");
    }
}
