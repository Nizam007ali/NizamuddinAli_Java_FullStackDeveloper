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
public class J049LoopBreak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("====================Loop Break====================");
        System.out.println("==================================================");
        for (int i = 0; i < 10; i++) {
            if(i==6) break;
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("==================================================");
    }
}
