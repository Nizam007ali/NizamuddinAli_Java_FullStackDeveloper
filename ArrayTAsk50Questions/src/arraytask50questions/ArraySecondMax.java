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
public class ArraySecondMax {

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
        int max = arr[arr1.length-1];
        int smax = -1;
        for (int i = arr1.length-1; i >= 0; i--) {
            if (arr1[i] == max) {
            } else {
                smax = arr1[i];
                break;
            }
        }
        if(smax==-1) System.out.println("No Second Max");
        else System.out.println("Second max is " + smax);
    }
}
