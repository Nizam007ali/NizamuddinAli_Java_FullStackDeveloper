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
public class ArrayIncreasingSubArray {

    public static void main(String[] args) {
        Array a = new Array();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element in array : ");
        int n = sc.nextInt();
        int arr[] = a.getIntArray(n);
//        int arr[] = {1, 2, 7, 4, 5, 6, 1, 4, 5, 7, 5, 8};
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            int c = 0;
            int max = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (max < arr[j]) {
                    c++;
                    max = arr[j];
                } else {
                    break;
                }
            }
            arr1[i] = c;
        }
        int elementValue = 0, element = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (elementValue < arr1[i]) {
                elementValue = arr1[i];
                element = i;
            }
        }
        a.showIntArray(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i >= element && i <= (element + elementValue)) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");
    }
}
