/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Search;

import java.util.Arrays;

/**
 *
 * @author nizam
 */
public class binarySearch {

    public static int bs(int arr[], int s) {
        int low = 0, high = arr.length - 1, mid;
        for (int i = 0; i < arr.length; i++) {
            mid = (low + high) / 2;
            if (arr[mid] == s) {
                return mid;
            } else if (arr[mid] > s) {
                low = mid + 1;
            } else if (arr[mid] < s) {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {40, 80, 0, 10, 90, 20, 70, 60, 50, 30, 100};
        Arrays.sort(arr);
        int r = bs(arr, 50);
        if (r == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at position " + r + ".");
        }
    }

}
