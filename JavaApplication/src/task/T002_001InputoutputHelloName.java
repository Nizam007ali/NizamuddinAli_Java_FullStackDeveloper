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
public class T002_001InputoutputHelloName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("====================Hello Name====================");
        System.out.println("==================================================");
        System.out.print("Enter your name : ");
        String n = sc.nextLine();
        System.out.println("==================================================");
        System.out.println("Hello");
        System.out.println("==>"+n);
        System.out.println("==================================================");
    }
}
