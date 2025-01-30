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
public class T004_ht004Loop10To20EvenSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("========= Loop print 10 to 20 even square ========");
        System.out.println("==================================================");
        for(int i=10; i<=20; i++) {
            if(i%2==0) System.out.println(i+" square is "+i*i);
        }
        System.out.println("==================================================");
    }
}
