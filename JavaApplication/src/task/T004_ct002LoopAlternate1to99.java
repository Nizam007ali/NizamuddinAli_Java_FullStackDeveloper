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
public class T004_ct002LoopAlternate1to99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("========== Loop print alternate 1 to 99 ==========");
        System.out.println("==================================================");
        for(int i=1; i<=99; i+=2) {
            System.out.print(i+" ");
            if(i%30==1 && i!=1) System.out.println("");
        }
        System.out.println("");
        System.out.println("==================================================");
    }
}
