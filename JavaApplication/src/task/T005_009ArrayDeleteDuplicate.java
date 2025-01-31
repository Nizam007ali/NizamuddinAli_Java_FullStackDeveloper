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
public class T005_009ArrayDeleteDuplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("============== Array delete duplicate =============");
        System.out.println("===================================================");
//        int arr[] = {5, 1, 6, 0, 0, 3, 9, 0, 6, 7, 8, 12, 10, 0, 2}, cnt = 0;
        System.out.print("Enter array size : ");
        int n=sc.nextInt(),cnt=0;
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter "+(i+1)+" value : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    break;
                }
            }
        }
        int arr1[] = new int[arr.length - cnt], k = 0;
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            boolean b = true;
            System.out.print(" " + arr[i]);
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    b = false;
                    break;
                }
            }
            if (b) {
                arr1[k] = arr[i];
                k++;
            }
        }
        System.out.println("");
        System.out.print("Array after deleting duplicate element : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" " + arr1[i]);
        }
        System.out.println("");
        System.out.println("===================================================");
    }
}
