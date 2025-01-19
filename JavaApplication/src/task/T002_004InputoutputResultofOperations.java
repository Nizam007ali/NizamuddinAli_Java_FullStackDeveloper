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
public class T002_004InputoutputResultofOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("================Result of oprations===============");
        System.out.println("==================================================");
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c = 20 + -3 * 5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("a. -5 + 8 * 6 = " + a);
        System.out.println("b. (55 + 9) % 9 = " + b);
        System.out.println("c. 20 + -3 * 5 / 8 = " + c);
        System.out.println("d. 5 + 15 / 3 * 2 - 8 % 3 = " + d);
        System.out.println("==================================================");
    }
}
