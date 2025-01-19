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
public class J038LoopMultipleOf3And5From1to60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("===========3 and 5 multiple from 1 to 60==========");
        System.out.println("==================================================");
        for(int i=1; i<=60;i++) {
            if(i%5==0 && i%3==0)
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("==================================================");
    }
}
