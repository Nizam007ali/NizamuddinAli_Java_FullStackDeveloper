/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraytask50questions;

/**
 *
 * @author nizam
 */
public class ArrayStringInteger {

    public static void main(String[] args) {

        String arr[] = {"Nizam", "77", "88", "Badman", "99"};
        int countInt = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                int s = Integer.parseInt(arr[i]);
                countInt++;
            } catch (Exception e) {
            }
        }
        int ArrInt[] = new int[countInt];
        int CountStr = arr.length - countInt;
        String ArrStr[] = new String[(CountStr)];
        int j = 0, k = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                int s = Integer.parseInt(arr[i]);
                ArrInt[j] = s;
                j++;
            } catch (Exception e) {
                String s = arr[i];
                ArrStr[k] = s;
                k++;
            }
        }
        System.out.println("Integer Count : " + countInt);
        System.out.println("String Count : " + (arr.length - countInt));
        System.out.print("New Integer Array : ");
        for (int i = 0; i < ArrInt.length; i++) {
            System.out.print(" --> " + ArrInt[i]);
        }
        System.out.println();
        System.out.print("New String Array : ");
        for (int i = 0; i < ArrStr.length; i++) {
            System.out.print(" --> " + ArrStr[i]);
        }
        System.out.println();
    }

}
