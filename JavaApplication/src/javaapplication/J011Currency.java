/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class J011Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter money : ");
        int c = sc.nextInt();
        int c2000, c500, c200, c100, c50, c20, c10, c5, c2, c1, r = c;
        c2000 = r/2000;
        r %= 2000;
        c500 = r/500;
        r %= 500;
        c200 = r/200;
        r %= 200;
        c100 = r/100;
        r %= 100;
        c50 = r/50;
        r %= 50;
        c20 = r/20;
        r %= 20;
        c10 = r/10;
        r %= 10;
        c5 = r/5;
        r %= 5;
        c2 = r/2;
        r %= 2;
        c1 = r/1;
        r %= 1;
        System.out.println("Currency : ");
        System.out.println("==================================================");
        System.out.println("Notes of 2000 : "+c2000);
        System.out.println("Notes of 500 : "+c500);
        System.out.println("Notes of 200 : "+c200);
        System.out.println("Notes of 100 : "+c100);
        System.out.println("Notes of 50 : "+c50);
        System.out.println("Notes of 20 : "+c20);
        System.out.println("Notes of 10 : "+c10);
        System.out.println("Notes of 5 : "+c5);
        System.out.println("Notes of 2 : "+c2);
        System.out.println("Notes of 1 : "+c1);
        System.out.println("==================================================");
        System.out.println("Total Notes : "+
                (c1+c2+c5+c10+c20+c50+c100+c200+c500+c2000));
    }
}
