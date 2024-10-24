/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraytask50questions;

/**
 *
 * @author nizam
 */
public class ArrayDeletePosition {

    public int[] arrDeleteVal(int[] arr, int value) {
        int arr1[] = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr[j]==value){
                j++;
            }
            arr1[i] = arr[j];
            j++;
        }
        return arr1;
    }

    public static void main(String[] args) {
        ArrayDeletePosition a = new ArrayDeletePosition();
        int arr[] = {10, 20, 30, 40};
        int arr1[] = a.arrDeleteVal(arr, 10);
        System.out.print("arr[]");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("-->" + arr[i]);
        }
        System.out.println();
        System.out.println("value to delete : 20");
        System.out.print("arr1[]");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("-->" + arr1[i]);
        }
        System.out.println();
    }
}
