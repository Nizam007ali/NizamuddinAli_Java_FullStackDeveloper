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
public class T003_004ConditionalTwoFloatNumberEqualUpto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("========take two float number and out equal=======");
        System.out.println("==================================================");
        System.out.print("Enter first number : ");
        float n1 = sc.nextFloat();
        System.out.print("Enter second number : ");
        float n2 = sc.nextFloat();
        System.out.println("==================================================");
        float m1=n1*1000;
        float m2=n2*1000;
        if((int)m1==(int)m2) {
            System.out.println("Equal.");
        } else {
            System.out.println("Not equal.");
        } 
        System.out.println("==================================================");
    }
}
