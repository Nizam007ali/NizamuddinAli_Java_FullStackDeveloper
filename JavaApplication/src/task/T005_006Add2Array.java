/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;

import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class T005_006Add2Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("================== Array Add two ==================");
        System.out.println("===================================================");
        int arr1[] = {5, 1, 6, 0, 0, 3, 9, 0};
        int arr2[] = {6, 7, 8, 12, 10, 0, 2};
        int arr[] = new int[arr1.length + arr2.length];
//        System.out.print("Enter array size : ");
//        int n=sc.nextInt(),cnt=0;
//        int arr[] = new int[n];
//        for(int i=0; i<arr.length; i++) {
//            System.out.print("Enter "+(i+1)+" value : ");
//            arr[i] = sc.nextInt();
//        }
        System.out.println("");
        System.out.print("Array1 : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" " + arr1[i]);
        }
        System.out.println("");
        System.out.print("Array2 : ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(" " + arr2[i]);
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr1.length) {
                for (int j = 0; j < arr1.length; j++) {
                    if (i == j) {
                         arr[i] =arr1[j];
                    }
                }
            } else {
                for (int j = 0; j < arr2.length; j++) {
                    if (i == j+arr1.length) {
                        arr[i] = arr2[j];
                    }
                }
            }
        }
        System.out.println("");
        System.out.print("Add of Arrays : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("");
        System.out.println("===================================================");
    }
}
