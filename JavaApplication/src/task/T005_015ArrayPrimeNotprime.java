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
public class T005_015ArrayPrimeNotprime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("============== Array prime not prime ==============");
        System.out.println("===================================================");
//        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " value : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (int j = 2; j < (arr[i] + 1 / 2); j++) {
                if (arr[i] % j == 0) {
                    cnt++;
                    break;
                }
            }
            if (cnt > 0) {
                System.out.println(arr[i] + " is not the prime number");
            } else {
                System.out.println(arr[i] + " is the prime number");
            }
            System.out.println("===================================================");
        }
    }
}
