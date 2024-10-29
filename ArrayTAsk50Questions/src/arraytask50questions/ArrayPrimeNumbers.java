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
public class ArrayPrimeNumbers {

    public boolean isPrime(int n) {
        int cnt = 0;
        boolean ch = false;
        if (n == 1 || n < 0) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        if (cnt == 0) {
            ch = true;
        }
        return ch;
    }

    public static void main(String[] args) {
        ArrayPrimeNumbers a = new ArrayPrimeNumbers();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + " element : " + arr[i]);
            if (a.isPrime(arr[i])) {
                System.out.print(" is Prime");
            } else {
                System.out.print(" is not Prime");
            }
            System.out.println();
        }
    }
}
