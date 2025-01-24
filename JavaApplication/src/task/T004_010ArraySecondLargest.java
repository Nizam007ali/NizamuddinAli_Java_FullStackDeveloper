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
public class T004_010ArraySecondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("=============== Array second largest ==============");
        System.out.println("===================================================");
//        int arr[] = {5, 1, 6, 0, 0, 3, 9, 0, 6, 7, 8, 12, 10, 0, 2}, L = arr[0], sL;
        System.out.print("Enter array size : ");
        int n=sc.nextInt(),cnt=0;
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter "+(i+1)+" value : ");
            arr[i] = sc.nextInt();
        }
        int L = arr[0], sL;
        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
            if (arr[i] > L) {
                L = arr[i];
            }
        }
        System.out.println("");
        System.out.println("Largest : "+L);
        if(arr[0]==L) sL=arr[1];
        else sL=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sL && arr[i]!=L) {
                sL = arr[i];
            }
        }
        System.out.println("Second Largest : "+sL);
        System.out.println("===================================================");
    }
}
