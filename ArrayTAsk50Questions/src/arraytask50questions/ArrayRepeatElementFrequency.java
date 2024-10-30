/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraytask50questions;

/**
 *
 * @author nizam
 */
public class ArrayRepeatElementFrequency {

    public static void main(String[] args) {
        Array a = new Array();
        int arr[] = a.getIntArray(5);
        int arr1[] = arr;
        a.showIntArray(arr1);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) {
                int cnt = 0;
                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr1[i] == arr1[j]) {
                        arr1[j] = -1;
                        cnt++;
                    }
                }
                if (cnt > 0) {
                    System.out.println(arr1[i] + " ---> " + cnt);
                }
            }
        }
    }
}
