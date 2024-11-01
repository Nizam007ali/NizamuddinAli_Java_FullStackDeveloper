/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraytask50questions;

import java.util.Arrays;

/**
 *
 * @author nizam
 */
public class ArrayUnionAndIntersection {

    public static void main(String[] args) {

        int arr1[] = {1, 2, 2, 3, 1, 5, 4, 1, 8, 7, 9};
        int arr2[] = {6, 4, 2, 3, 5, 4, 6, 8, 5, 4};
        int length;

        if (arr1.length > arr2.length) {
            length = arr2.length;
        } else {
            length = arr1.length;
        }

        int arr1s[] = new int[arr1.length];
        int arr2s[] = new int[arr2.length];
        int uni[] = new int[arr1.length + arr2.length];
        int ins[] = new int[length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            int cnt = 0;
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                arr1s[k] = arr1[i];
                k++;
            }
        }
        k = 0;
        for (int i = 0; i < arr2.length; i++) {
            int cnt = 0;
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] == arr2[j]) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                arr2s[k] = arr2[i];
                k++;
            }
        }
        k = 0;
        for (int i = 0; i < arr1s.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr2s.length; j++) {
                if (arr1s[i] == arr2s[j]) {
                    cnt++;
                }
            }
            if (cnt > 0) {
                ins[k] = arr1s[i];
                k++;
            }
        }
        k = 0;
        for (int i = 0; i < arr1s.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr2s.length; j++) {
                if (arr1s[i] == arr2s[j]) {
                    cnt++;
                }
            }
            if (cnt > 0 || cnt == 0) {
                uni[k] = arr1s[i];
                k++;
            }
        }
        Array a = new Array();
        Arrays.sort(uni);
        Arrays.sort(ins);
        a.showIntArray(arr1);
        a.showIntArray(arr2);
        System.out.print("Union : ");
        for (int i = 0; i < uni.length; i++) {
            if (uni[i] == 0) {
            } else {
                System.out.print(uni[i]+" ");
            }
        }
        System.out.println("");
        System.out.print("Intersection : ");
        for (int i = 0; i < ins.length; i++) {
            if (ins[i] == 0) {
            } else {
                System.out.print(ins[i]+" ");
            }
        }
        System.out.println("");
    }
}
