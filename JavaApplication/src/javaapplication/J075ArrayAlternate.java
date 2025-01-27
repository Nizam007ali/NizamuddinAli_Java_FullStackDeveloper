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
public class J075ArrayAlternate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("======== Array Take and display Alternate ========");
        System.out.println("==================================================");
        int arr[] = new int[5];     // initalizon without value only length needed
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter value "+(i+1)+" of array : ");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
        System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.println("==================== Alternate ===================");
        for(int i=0; i<arr.length; i+=2){
        System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.println("==================================================");
    }
}
