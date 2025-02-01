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
public class T005_013ArrayPosNeg0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("========== Array positive negative zero ==========");
        System.out.println("==================================================");
//        int arr[] = {20, -10, 15, 00, -85}, pcnt = 0, ncnt = 0, cnt0 = 0;
        System.out.print("Enter array size : ");
        int n=sc.nextInt(), pcnt = 0, ncnt = 0, cnt0 = 0;
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter "+(i+1)+" value : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("");
        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
            if (arr[i] == 0) {
                cnt0++;
            } else if (arr[i] > 0) {
                pcnt++;
            } else {
                ncnt++;
            }
        }
        System.out.println("");
        System.out.println("Positive number : "+pcnt);
        System.out.println("Negative number : "+ncnt);
        System.out.println("Zero : "+cnt0);
        System.out.println("==================================================");
    }
}
