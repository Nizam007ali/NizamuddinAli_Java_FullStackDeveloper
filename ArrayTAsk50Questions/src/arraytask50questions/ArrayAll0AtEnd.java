/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraytask50questions;

/**
 *
 * @author nizam
 */
public class ArrayAll0AtEnd {

    public int checkZero(int arr[]) {
        int z = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                z++;
            }
        }
        return z;
    }

    public int[] array(int[] arr) {
        int z = checkZero(arr);
        int i = 1;
        while (i < z) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 0) {
                    for (int k = j; k < arr.length; k++) {
                        if (arr[k] != 0) {
                            arr[j] = arr[k];
                            arr[k] = 0;
                            i++;
                            break;
                        }
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        ArrayAll0AtEnd a = new ArrayAll0AtEnd();
        int arr[] = {1, 0, 2, 5, 3, 0, 4, 0, 5, 6, 0, 8, 0, 7, 0, 9};
        int arr1[] = a.array(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(i+"--->"+arr1[i]);
        }
    }

}
