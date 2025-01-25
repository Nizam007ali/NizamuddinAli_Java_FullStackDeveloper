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
public class J064LoopPattern13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("================              0  ================");
        System.out.println("================           0  1  ================");
        System.out.println("================        0  1  0  ================");
        System.out.println("================     0  1  0  1  ================");
        System.out.println("================  0  1  0  1  0  ================");
        System.out.println("=================================================");
        int r = 5, c = 5, n=1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                n=(n==1)?0:1;
                if(j+i>=6) System.out.print("  "+n);
                else System.out.print("   ");
                if(j==c) System.out.println("  ");
            }
        }
        System.out.println("==================================================");
    }
}
