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
public class ArrayMissingInteger {

    public int missingIneteger() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " number : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("-->" + arr[i]);
        }
        System.out.println();
        int m = 0;
        int first = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (((first++) - arr[i]) != 0) {
                m = (arr[i] - 1);
                break;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        ArrayMissingInteger a = new ArrayMissingInteger();
        System.out.println(a.missingIneteger());
    }
}
