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
public class T004_ct001Loop1To100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("=============== Loop print 1 to 100 ==============");
        System.out.println("==================================================");
        for(int i=1; i<=100; i++) {
            System.out.print(i+" ");
            if(i%20==0) System.out.println("");
        }
        System.out.println("==================================================");
    }
}
