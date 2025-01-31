/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;

import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class T005_005ArrayOddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("================= Array odd even =================");
        System.out.println("===================================================");
//        int arr[] = {5, 1, 6, 0, 0, 3, 9, 0, 6, 7, 8, 12, 10, 0, 2}, cnt = 0;
        System.out.print("Enter array size : ");
        int n=sc.nextInt(),cnt=0;
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter "+(i+1)+" value : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("");
        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
            if (arr[i] % 2 == 0) {
                cnt++;
            }
        }
        System.out.println("");
        int arre[] = new int[cnt], arro[] = new int[arr.length - cnt], j1 = 0,j2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arre[j1] = arr[i];
                j1++;
            } else {
                arro[j2] = arr[i];
                j2++;
            }
        }

        System.out.println("");
        System.out.print("Odd Array : ");
        for (int i = 0; i < arro.length; i++) {
            System.out.print(" " + arro[i]);
        }
        System.out.println("");
        System.out.print("Even Array : ");
        for (int i = 0; i < arre.length; i++) {
            System.out.print(" " + arre[i]);
        }
        System.out.println("");
        System.out.println("===================================================");
    }
}
