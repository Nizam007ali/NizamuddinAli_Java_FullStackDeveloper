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
public class T004_012ArraySmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("================= Array Smallest =================");
        System.out.println("==================================================");
//        int arr[] = {5, 1, 6, 0, 0, 3, 9, 0, 6, 7, 8, 12, 10, 0, 2}, S = arr[0], sS;
        System.out.print("Enter array size : ");
        int n=sc.nextInt();
        int arr[] = new int[n],cnt=0;
        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter "+(i+1)+" value : ");
            arr[i] = sc.nextInt();
        }
        int S = arr[0];
        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
            if (arr[i] < S) {
                S = arr[i];
            }
        }
        System.out.println("");
        System.out.println("Smallest : "+S);
        System.out.println("==================================================");
    }
}
