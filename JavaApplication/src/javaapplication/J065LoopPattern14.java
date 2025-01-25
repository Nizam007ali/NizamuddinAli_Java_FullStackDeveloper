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
public class J065LoopPattern14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("================              *  ================");
        System.out.println("================           *  *  ================");
        System.out.println("================        *  *  *  ================");
        System.out.println("================     *  *  *  *  ================");
        System.out.println("================  *  *  *  *  *  ================");
        System.out.println("=================================================");
        int r = 5, c = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if(j+i>=6) System.out.print("  *");
                else System.out.print("   ");
                if(j==c) System.out.println("  ");
            }
        }
        System.out.println("==================================================");
    }
}
