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
public class T004_ht005Loop0To10OddCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("=========== Loop print 0 to 10 odd cube ==========");
        System.out.println("==================================================");
        for(int i=0; i<=10; i++) {
            if(i%2==1) System.out.println(i+" cube is "+i*i*i);
        }
        System.out.println("==================================================");
    }
}
