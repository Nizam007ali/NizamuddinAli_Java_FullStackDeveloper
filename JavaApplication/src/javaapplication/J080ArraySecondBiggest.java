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
public class J080ArraySecondBiggest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("============== Array Second Biggest ==============");
        System.out.println("==================================================");
        int arr[] = new int[5];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter value "+(i+1)+" of array : ");
            arr[i] = sc.nextInt();
        }
        int m = arr[0], sm=arr[1];
        System.out.print("Array : ");
        for(int i=0; i<arr.length; i++){
        System.out.print(" "+arr[i]);
        if(m<arr[i]){
            m=arr[i];
        }
        }
        for(int i=0; i<arr.length; i++){
        if(sm<arr[i] && arr[i]!=m){
            sm=arr[i];
        }
        }
        System.out.println();
        System.out.println("Largest : "+m);
        System.out.println("Second Largest : "+sm);
        System.out.println("==================================================");
    }
}
