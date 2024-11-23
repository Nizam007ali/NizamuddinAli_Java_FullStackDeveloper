/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sort;

/**
 *
 * @author nizam
 */
public class MergeSortDemo {

    public static void Display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("-->" + arr[i]);
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int arr[], int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;
        int larr[] = new int[n1];
        int rarr[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            larr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rarr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        
        while (i < n1 && j < n2) {
            if (larr[i] <= rarr[j]) {
                arr[k] = larr[i];
                i++;
            } else {
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = larr[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            arr[k] = rarr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 7, 8, 5, 1, 6, 2, 9, 4, 0};
        System.out.println("Array Elements before sorting : ");
        Display(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Array Elements after sorting : ");
        Display(arr);
    }

}
