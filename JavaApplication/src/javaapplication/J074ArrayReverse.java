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
public class J074ArrayReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("========== Array Take and display Reverse =========");
        System.out.println("===================================================");
        int arr[] = new int[5];     // initalizon without value only length needed
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter value "+(i+1)+" of array : ");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
        System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.println("===================== Reverse =====================");
        int arr1[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            arr1[i] = arr[arr.length-i-1];
        }
        for(int i=0; i<arr.length; i++){
        System.out.print(" "+arr1[i]);
        }
        System.out.println();
        System.out.println("==================================================");
    }
}
