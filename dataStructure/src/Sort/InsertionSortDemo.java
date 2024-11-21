package Sort;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nizam
 */
public class InsertionSortDemo {

    public static void Display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("-->" + arr[i]);
        }
        System.out.println();
    }

    public static void insertionSort(int arr[]) {
        int i, j;
        for (i = 0; i < arr.length; i++) {
            int key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            System.out.println("Step " + (i + 1) + " : ");
            Display(arr);
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 7, 8, 5, 1, 6, 2, 9, 4, 0};
        System.out.println("Array Elements before sorting : ");
        Display(arr);
        insertionSort(arr);
        System.out.println("Array Elements after sorting : ");
        Display(arr);
    }

}
