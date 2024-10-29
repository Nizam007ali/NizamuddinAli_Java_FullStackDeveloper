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
public class ArrayMergeTwo1D {

    public int[] merge(int arr[], int arr1[]) {
        int arr2[] = new int[arr.length + arr1.length];
        int j = 0, k = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (i < arr1.length) {
                arr2[i] = arr[j];
                j++;
            } else {
                arr2[i] = arr1[k];
                k++;
            }
        }
        return arr2;
    }

    public void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in first array : ");
        int m = sc.nextInt();
        int arr[] = new int[m];
        System.out.println("Enter number of elements in Second array : ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        ArrayMergeTwo1D a = new ArrayMergeTwo1D();
        System.out.println("arr : ");
        a.display(arr);
        System.out.println("arr1 : ");
        a.display(arr1);
        int[] arr2 = a.merge(arr, arr1);
        System.out.println("arr2 : ");
        a.display(arr2);

    }
}
