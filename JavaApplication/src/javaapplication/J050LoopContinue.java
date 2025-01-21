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
public class J050LoopContinue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("==================Loop Continue===================");
        System.out.println("==================================================");
        for (int i = 0; i < 10; i++) {
            if(i==6) continue;
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("==================================================");
    }
}
