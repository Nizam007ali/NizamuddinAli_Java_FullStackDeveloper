/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sort;

/**
 *
 * @author nizam
 */
public class SelectionSortDemo {

    public static void Display(int arr[]) {
        System.out.println("Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("-->" + arr[i]);
        }
        System.out.println();
    }

    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int c = arr[i];
            arr[i] = arr[min];
            arr[min] = c;
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 7, 8, 5, 1, 6, 2, 9, 4, 0};
        Display(arr);
        SelectionSort(arr);
        Display(arr);
    }

}
