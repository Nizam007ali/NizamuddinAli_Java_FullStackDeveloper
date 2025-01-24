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
public class J058LoopPattern7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("================  1              ================");
        System.out.println("================  1  2           ================");
        System.out.println("================  1  2  3        ================");
        System.out.println("================  1  2  3  4     ================");
        System.out.println("================  1  2  3  4  5  ================");
        System.out.println("=================================================");
        int r = 5;
        int c = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if(j<=i) System.out.print("  "+j);
                else System.out.print("   ");
                if(j==c) System.out.println("  ");
            }
        }
        System.out.println("==================================================");
    }
}
