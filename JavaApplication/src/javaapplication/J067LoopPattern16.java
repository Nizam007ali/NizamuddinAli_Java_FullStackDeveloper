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
public class J067LoopPattern16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("===========              *              ===========");
        System.out.println("===========           *  *  *           ===========");
        System.out.println("===========        *  *  *  *  *        ===========");
        System.out.println("===========     *  *  *  *  *  *  *     ===========");
        System.out.println("===========  *  *  *  *  *  *  *  *  *  ===========");
        System.out.println("===================================================");
        int r = 5, c = 9, c1 = 6;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if(j<6){if (j + i >= 6) {
                    System.out.print("  *");
                } else {
                    System.out.print("   ");
                }}
                if(j>5){if (j<i+5) {
                    System.out.print("  *");
                    c1++;
                } else {
                    System.out.print("   ");
                }}
                if (j == c) {
                    System.out.println("  ");
                }
            }
        }
        System.out.println("==================================================");
    }
}
