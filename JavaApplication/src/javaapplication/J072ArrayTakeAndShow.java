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
public class J072ArrayTakeAndShow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("============= Array Take and display =============");
        System.out.println("==================================================");
        int arr[] = new int[5];     // initalizon without value only length needed
        System.out.print("Enter value 1 of array : ");
        arr[0] = sc.nextInt();
        System.out.print("Enter value 2 of array : ");
        arr[1] = sc.nextInt();
        System.out.print("Enter value 3 of array : ");
        arr[2] = sc.nextInt();
        System.out.print("Enter value 4 of array : ");
        arr[3] = sc.nextInt();
        System.out.print("Enter value 5 of array : ");
        arr[4] = sc.nextInt();
        System.out.println("Length : "+arr.length);
        System.out.println("arr[0] : "+arr[0]);
        System.out.println("arr[1] : "+arr[1]);
        System.out.println("arr[2] : "+arr[2]);
        System.out.println("arr[3] : "+arr[3]);
        System.out.println("arr[4] : "+arr[4]);
        System.out.println("==================================================");
    }
}
