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
public class J059LoopPattern8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("================  1              ================");
        System.out.println("================  2  3           ================");
        System.out.println("================  4  5  6        ================");
        System.out.println("================  7  8  9 10     ================");
        System.out.println("================ 11 12 13 14 15  ================");
        System.out.println("=================================================");
        int r = 5, c = 5, cnt = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (j <= i && cnt < 10) {
                    System.out.print("  " + cnt);
                    cnt++;
                } else if (j <= i && cnt > 9) {
                    System.out.print(" " + cnt);
                    cnt++;
                } else {
                    System.out.print("   ");
                }
                if (j == c) {
                    System.out.println("  ");
                }
            }
        }
        System.out.println("==================================================");
    }
}
