/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraytask50questions;

/**
 *
 * @author nizam
 */
public class ArrayEvenNumberRepeat {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 1, 4, 5, 7, 5, 8};
        int arr1[] = arr;
        Array a = new Array();
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
                if (i == 0) {
                    System.out.print("Number with even repeatition ---> ");
                }
                if ((cnt + 1) % 2 == 0 && cnt != 0) {
                    System.out.print(arr1[i] + "  " );
                }
            }
        }
        System.out.println("");
    }
}
