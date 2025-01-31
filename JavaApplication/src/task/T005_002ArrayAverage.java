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
public class T005_002ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("================== Array Average ==================");
        System.out.println("===================================================");
        System.out.print("Enter array size : ");
        int n=sc.nextInt(),sum=0;
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter "+(i+1)+" value : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array : ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(" "+arr[i]);
            sum+=arr[i];
        }
        System.out.println("");
        System.out.println("Average : "+((float)sum/n));
        System.out.println("===================================================");
    }
}
