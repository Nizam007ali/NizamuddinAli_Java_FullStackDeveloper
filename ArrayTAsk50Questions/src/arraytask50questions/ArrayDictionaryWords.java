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
public class ArrayDictionaryWords {

    public static void main(String[] args) {
        Array a = new Array();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Names in array : ");
        int n = sc.nextInt();
        String arr[] = a.getStrArray(n);
//        String arr[] = {"My", "Name", "is", "Nizamuddin", "Ali"};
        String arr1[] = new String[arr.length];
        a.showStrArray(arr);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        a.showStrArray(arr);
    }
}
