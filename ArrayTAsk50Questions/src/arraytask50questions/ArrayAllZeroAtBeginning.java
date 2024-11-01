/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraytask50questions;

/**
 *
 * @author nizam
 */
public class ArrayAllZeroAtBeginning {

    public static void main(String[] args) {

        int arr[] = {1, 2, 0, 2, 3, 1, 0, 5, 4, 0, 1, 8, 7, 9, 6, 4, 0, 2, 3, 5, 4, 6, 8, 0, 5, 4};
        int arr1[] = new int[arr.length];
        int cnt0 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                cnt0++;
            }
        }
        System.out.println(cnt0);
        int j = cnt0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                arr1[k]=0;
                k++;
            } else {
                arr1[j] =  arr[i];
                j++;
            }
        }
        Array a = new Array();
        a.showIntArray(arr);
        a.showIntArray(arr1);
    }
}
