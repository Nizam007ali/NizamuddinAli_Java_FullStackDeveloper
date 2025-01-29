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
public class J083ArrayBubbleSort {

    public static void main(String[] args) {
        System.out.println("===================================================");
        System.out.println("================ Array Bubble Sort ================");
        System.out.println("===================================================");
        int arr[] = {40, 20, 50, 10, 30};
        System.out.println("Before sorting :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After sorting :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.println("===================================================");
    }
}
