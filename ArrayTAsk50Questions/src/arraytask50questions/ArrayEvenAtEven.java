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
public class ArrayEvenAtEven {

    public static void main(String[] args) {
        Array a = new Array();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element in array : ");
        int n = sc.nextInt();
        int arr[] = a.getIntArray(n);
//        int arr[] = {1, 2, 7, 4, 5, 6, 1, 4, 5, 7, 5, 8};
        a.showIntArray(arr);
        System.out.println("Even numbet at even position : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && (i + 1) % 2 == 0) {
                System.out.println("position : " + (i + 1) + " --> Element : " + arr[i]);
            }
        }
        System.out.println("");
    }
}
