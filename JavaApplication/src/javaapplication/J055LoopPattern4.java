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
public class J055LoopPattern4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("================  1              ================");
        System.out.println("================  2  2           ================");
        System.out.println("================  3  2  3        ================");
        System.out.println("================  4  4  4  4     ================");
        System.out.println("================  5  5  5  5  5  ================");
        System.out.println("=================================================");
        int r = 5;
        int c = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if(j<=i) System.out.print("  "+i);
                else System.out.print("   ");
                if(j==c) System.out.println("  ");
            }
        }
        System.out.println("==================================================");
    }
}
