/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraytask50questions;

import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class ArrayEvenOddSeparate {

    public int evenNoInArray(int[] arr) {
        int e = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                e++;
            }
        }
        return e;
    }

    public int[] evenArray(int[] arr) {
        int arr1[] = new int[evenNoInArray(arr)];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr1[j] = arr[i];
                j++;
            }
        }
        return arr1;
    }

    public int[] oddArray(int[] arr) {
        int arr1[] = new int[arr.length - evenNoInArray(arr)];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                arr1[j] = arr[i];
                j++;
            }
        }
        return arr1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("arr");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("-->" + arr[i]);
        }
        System.out.println();
        ArrayEvenOddSeparate a = new ArrayEvenOddSeparate();
        int arr1[] = a.evenArray(arr);
        System.out.print("Even arr");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("-->" + arr1[i]);
        }
        System.out.println();
        int arr2[] = a.oddArray(arr);
        System.out.print("Odd arr");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("-->" + arr2[i]);
        }
        System.out.println();

    }

}
