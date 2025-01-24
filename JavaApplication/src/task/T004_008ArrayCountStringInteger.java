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
public class T004_008ArrayCountStringInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("=========== Array Count String Integer ===========");
        System.out.println("==================================================");

        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        String arr[]= new String[n];
        for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter " + (i + 1) + "  value : ");
                arr[i] = sc.nextLine();
            
        }
//        String arr[] = {"Raj", "01", "Rani", "10", ""};
        int cnt = 0, blank = 0;
        boolean isInt = true;
        System.out.println("");
        System.out.println("Array : ");
        for (int i = 0; i < arr.length; i++) {
            isInt = true;
            System.out.print("\t" + arr[i]);
            if (arr[i].length() == 0) {
                isInt = false;
                blank++;
            }
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) <= 57 && arr[i].charAt(j) >= 48) {
                } else {
                    isInt = false;
                }
            }
            if (isInt) {
                cnt++;
            }
        }
        System.out.println("");
        System.out.println("String : " + (arr.length - cnt - blank));
        System.out.println("Int : " + cnt);
        System.out.println("");
        System.out.println("===================================================");
    }
}
