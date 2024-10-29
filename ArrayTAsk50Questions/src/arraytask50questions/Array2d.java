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
public class Array2d {

    public void display(int m, int n) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("value of "+(i+1)+" row "+(j+1)+" column : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("------------------------------------------------------------------------");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Array2d a = new Array2d();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row in array : ");
        int m = sc.nextInt();
        System.out.println("Enter number of column in array : ");
        int n = sc.nextInt();
        a.display(m, n);

    }

}
