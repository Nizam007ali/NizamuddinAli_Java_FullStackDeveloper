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
public class ArraySumAverage {
    
    public int[] arrayInitialise() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " number : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("-->" + arr[i]);
        }
        System.out.println();
        return arr;
    }
    
    public int sumArray(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    public int avgArray(int sum, int[] arr) {
        return sum/arr.length;
    }
    
    public static void main(String[] args) {
        
        ArraySumAverage a = new ArraySumAverage();
        int arr[] = a.arrayInitialise();
        System.out.println(a.sumArray(arr));
        System.out.println(a.avgArray(a.sumArray(arr), arr));
        
    }
}
