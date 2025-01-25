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
public class J061LoopPattern10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("================  E  E  E  E  E  ================");
        System.out.println("================  D  D  D  D     ================");
        System.out.println("================  C  C  C        ================");
        System.out.println("================  B  B           ================");
        System.out.println("================  A              ================");
        System.out.println("=================================================");
        int r = 5, c = 5, cnt = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (j+i<=6) {
                    System.out.print("  " + (char)(cnt+64));
                } else {
                    System.out.print("   ");
                }
                if (j == c) {
                    System.out.println("  ");
                }
            }
            cnt++;
        }
        System.out.println("==================================================");
    }
}
