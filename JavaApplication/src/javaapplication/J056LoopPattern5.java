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
public class J056LoopPattern5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("================  5  5  5  5  5  ================");
        System.out.println("================  4  4  4  4     ================");
        System.out.println("================  3  3  3        ================");
        System.out.println("================  2  2           ================");
        System.out.println("================  1              ================");
        System.out.println("=================================================");
        int r = 5, c = 5, n = 5;
        // 1 5 //2 4 //3 3 //4 2//1 5
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if(j+i<7) System.out.print("  "+n);
                else System.out.print("   ");
                if(j==c) System.out.println("  ");
            }
            n--;
        }
        System.out.println("==================================================");
    }
}
