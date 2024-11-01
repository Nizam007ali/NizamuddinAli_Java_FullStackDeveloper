/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraytask50questions;

/**
 *
 * @author nizam
 */
public class ArrayStritlyIncreasingDcreasingMaximum {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 4, 0, 1, 8, 9, 6, 4, 0, 2, 3, 5, 6, 8, 5, 4, 0};
        int k = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) {
                if (k == 0) {
                    System.out.print(arr[i]);
                    k++;
                } else {
                    System.out.print(" or " + arr[i]);
                }
            }
        }
        System.out.println("");
    }
}
