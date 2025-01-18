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
public class T002_002Inputoutputadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("========================Add=======================");
        System.out.println("==================================================");
        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();
        System.out.println("==================================================");
        System.out.println(n1+" + "+n2+" = "+(n1+n2));
        System.out.println("==================================================");
    }
}
