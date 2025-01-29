/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;

import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class T004_ct003LoopAlternate0to100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("========== Loop print alternate 0 to 100 =========");
        System.out.println("==================================================");
        for(int i=0; i<=100; i+=2) {
            System.out.print(i+" ");
            if(i%30==0 && i!=0) System.out.println("");
        }
        System.out.println("");
        System.out.println("==================================================");
    }
}
