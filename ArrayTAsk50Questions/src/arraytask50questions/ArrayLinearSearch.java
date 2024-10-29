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
public class ArrayLinearSearch {

    public static void main(String[] args) {
        int arr[] = {5, 3, 9, 2, 1, 8, 0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search in array :- ");
        int n = sc.nextInt();
        System.out.print("Arrays before sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" ---> " + arr[i]);
        }
        System.out.print(".");
        System.out.println("");
        System.out.print("Arrays after sort ");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" ---> " + arr[i]);
        }
        System.out.println("");
        boolean ch = false;
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                ch = true;
                break;
            }
        }
        if(ch) System.out.println("Elememt found");
        System.out.println("");
    }
}
