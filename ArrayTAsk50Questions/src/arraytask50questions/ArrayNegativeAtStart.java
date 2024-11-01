/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraytask50questions;

/**
 *
 * @author nizam
 */
public class ArrayNegativeAtStart {

    public static void main(String[] args) {

        int arr[] = {-12, 11, 13, -5, 6, -7, 5, -3, -6};
        int arr1[] = new int[arr.length];
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0) {
                cnt++;
            }
        }
        int j = 0, k = cnt;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0) {
                arr1[j]=arr[i];
                j++;
            } else {
                arr1[k]=arr[i];
                k++;
            }
        }
        Array a = new Array();
        a.showIntArray(arr);
        a.showIntArray(arr1);
    }
}
