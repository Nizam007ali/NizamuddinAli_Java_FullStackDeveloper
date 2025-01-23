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
public class T004_004ArrayDeleteAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("============= Array Delete an element =============");
        System.out.println("===================================================");
        System.out.print("Enter array size : ");
        int n=sc.nextInt(),cnt=0;
//        int arr[] = { 5, 1, 6, 0, 0, 3, 9, 0, 6, 7, 8, 12, 10, 0, 2}, cnt = 0;
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter "+(i+1)+" value : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element you delete : ");
        int n1=sc.nextInt();
        System.out.println("");
        System.out.print("Array : ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(" "+arr[i]);
            if(arr[i]!=n1){
                cnt++;
            }
        }
        System.out.println(cnt+"");
        int arr1[] = new int[cnt], j = 0;
        for(int i=0; i<cnt; i++) {
            while(arr[j]==n1){
                j++;
            }
            arr1[i]=arr[j];
            j++;
        }
        
        System.out.println("");
        System.out.print("Array after deleting element : ");
        for(int i=0; i<arr1.length; i++) {
            System.out.print(" "+arr1[i]);
        }
        System.out.println("");
        System.out.println("===================================================");
    }
}
