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
public class ArrayPosNegZero {

    public static void main(String[] args) {
        int zcnt = 0, pcnt = 0, ncnt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zcnt++;
            } else if (arr[i] > 0) {
                pcnt++;
            } else {
                ncnt++;
            }
            System.out.println((i + 1) + " element : " + arr[i]);
        }
        System.out.println("Number of zeroes :- " + zcnt);
        System.out.println("Positive number :- " + pcnt);
        System.out.println("Negative number :- " + ncnt);
    }
}
