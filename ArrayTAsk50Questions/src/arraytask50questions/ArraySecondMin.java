/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraytask50questions;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class ArraySecondMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + " element : " + arr[i]);
        }
        int arr1[] = arr;
        Arrays.sort(arr1);
        int min = arr[0];
        int smin = -1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == min) {
            } else {
                smin = arr1[i];
                break;
            }
        }
        if (smin == -1) {
            System.out.println("No Second Min");
        } else {
            System.out.println("Second min is " + smin);
        }
    }
}
