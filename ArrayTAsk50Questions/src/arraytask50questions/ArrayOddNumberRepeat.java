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
public class ArrayOddNumberRepeat {

    public static void main(String[] args) {
        Array a = new Array();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element in array : ");
        int n = sc.nextInt();
        int arr[] = a.getIntArray(n);
        int arr1[] = arr;
        a.showIntArray(arr1);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) {
                int cnt = 0;
                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr1[i] == arr1[j]) {
                        arr1[j] = -1;
                        cnt++;
                    }
                }
                if (i == 0) {
                    System.out.print("Number with odd repeatition ---> ");
                }
                if ((cnt) % 2 == 0 || cnt == 0) {
                    System.out.print(arr1[i] + "  ");
                }
            }
        }
        System.out.println("");
    }
}
