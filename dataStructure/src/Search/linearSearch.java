/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Search;

/**
 *
 * @author nizam
 */
public class linearSearch {

    public static int ls(int arr[], int s) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {40, 80, 0, 10, 90, 20, 70, 60, 50, 30, 100};
        int r = ls(arr, 50);
        if (r == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at position " + (r+1) + ".");
        }
    }
}
