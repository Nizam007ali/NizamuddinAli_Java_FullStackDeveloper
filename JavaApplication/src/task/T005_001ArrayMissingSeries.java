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
public class T005_001ArrayMissingSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("=========== Missing series number Array ==========");
        System.out.println("==================================================");
        System.out.print("Enter array size : ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter "+(i+1)+" value : ");
            arr[i] = sc.nextInt();
        }
        int sum = ((n+2)*(n+1))/2, sum1=0;
        System.out.print("Array : ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(" "+arr[i]);
            sum1+=arr[i];
        }
        System.out.println("");
        System.out.println("Missing number : "+(sum-sum1));
        System.out.println("==================================================");
    }
}
