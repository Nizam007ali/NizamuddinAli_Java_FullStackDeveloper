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
public class J081ArraySecondSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("============== Array Second Smallest ==============");
        System.out.println("===================================================");
        int arr[] = new int[5];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter value "+(i+1)+" of array : ");
            arr[i] = sc.nextInt();
        }
        int s = arr[0], ss =1000000000;
        System.out.print("Array : ");
        for(int i=0; i<arr.length; i++){
        System.out.print(" "+arr[i]);
        if(s>arr[i]){
            s=arr[i];
        }
        }
        for(int i=0; i<arr.length; i++){
        if(ss>arr[i] && arr[i]!=s){
            ss=arr[i];
        }
        }
        System.out.println();
        System.out.println("Smallest : "+s);
        System.out.println("Second smallest : "+ss);
        System.out.println("===================================================");
    }
}
