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
public class J035LoopAllPrint1to5 {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("====================While loop====================");
        System.out.println("==================================================");
        int i = 1;
        while(i<6){
            System.out.print(i+" ");
            i++;
        }
        System.out.println("");
        System.out.println("==================================================");
        System.out.println("==================Do while loop===================");
        System.out.println("==================================================");
        int j = 1;
        do {
            System.out.print(j+" ");
            j++;
        } while(j<6);
        System.out.println("");
        System.out.println("==================================================");
        System.out.println("=====================For loop=====================");
        System.out.println("==================================================");
        for(int k=1;k<6;k++) {
            System.out.print(k+" ");
        }
        System.out.println("");
    }
}
