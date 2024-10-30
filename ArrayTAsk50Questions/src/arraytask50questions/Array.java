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

public class Array {

    public int[] getIntArray(int n) {
        int arr[] = new int[n];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter elment of array:-");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " element :");
            arr[i] = s.nextInt();
        }
        System.out.println("---------------------------------------------------");
        return arr;
    }
    
    public void showIntArray(int arr[]) {
        System.out.println("Elements of array:-");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + " element :"+arr[i]);
        }
    }

    public static void main(String[] args) {
        Array a = new Array();
        int arr[] = a.getIntArray(3);
        a.showIntArray(arr);
    }
}
