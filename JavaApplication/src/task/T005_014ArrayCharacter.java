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
public class T005_014ArrayCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("================= Array Character =================");
        System.out.println("===================================================");
//        char arr[] = {'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.print("Enter array size : ");
        int n=sc.nextInt();
        char arr[] = new char[n];
        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter "+(i+1)+" value : ");
            arr[i] = sc.nextLine().charAt(0);
        }
        System.out.println("");
        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("");
    }
}
