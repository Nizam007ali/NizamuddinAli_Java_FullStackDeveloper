/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class J082ArrayDecimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("============= Array Decimal To Binary =============");
        System.out.println("===================================================");
        int arr[] = new int[1000], i = 0; //0 to 255
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        while(n>0){
            arr[i] = n%2;
            n=n/2;
            i++;
        }
        System.out.println();
        System.out.println("Decimal : "+n);
        System.out.println("Binary : ");
        for (int j = i-1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
        System.out.println();
        System.out.println("===================================================");
    }
}
