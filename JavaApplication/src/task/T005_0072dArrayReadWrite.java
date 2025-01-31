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
public class T005_0072dArrayReadWrite {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("================ Array 2d Read Show ================");
        System.out.println("====================================================");

        System.out.print("Enter array row size : ");
        int r = sc.nextInt();
        System.out.print("Enter array column size : ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Enter row " + (i + 1) + " column " + (j + 1) + " value : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
        System.out.println("Array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("===================================================");
    }
}
