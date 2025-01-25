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
public class J062LoopPattern11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("================  A              ================");
        System.out.println("================  B  C           ================");
        System.out.println("================  D  E  F        ================");
        System.out.println("================  G  H  I  J     ================");
        System.out.println("================  K  L  M  N  O  ================");
        System.out.println("=================================================");
        int r = 5, c = 5, cnt = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (j <= i) {
                    System.out.print("  " + (char) (cnt + 64));
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
