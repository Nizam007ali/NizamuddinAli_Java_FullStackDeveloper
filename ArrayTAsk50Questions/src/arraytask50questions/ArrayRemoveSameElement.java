/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraytask50questions;

/**
 *
 * @author nizam
 */
public class ArrayRemoveSameElement {

    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 4, 1, 0, 3, 5, 4, 5};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                count++;
            }
        }
        System.out.println("Count : " + (arr.length - count));
        int newArr[] = new int[arr.length - count];
        int j = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (arr[j] == -1) {
                i--;
            } else {
                newArr[i] = arr[j];
            }
            if (j < 10) {
                j++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(" --> " + newArr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" --> " + arr[i]);
        }
        System.out.println();
    }
}
