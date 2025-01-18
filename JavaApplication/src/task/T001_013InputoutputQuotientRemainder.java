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
public class T001_013InputoutputQuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ototal = 0, etotal = 0, total = 0;
        System.out.println("==================================================");
        System.out.println("================5=input=Sum=of=Odds===============");
        System.out.println("==================================================");
        System.out.print("Enter Numerator : ");
        int n = sc.nextInt();
        System.out.print("Enter Denominator : ");
        int d = sc.nextInt();
        int q = n/d;
        int r = n%d;
        System.out.println("==================================================");
        System.out.println("Numerator is "+n+" and Denominator is "+d+".");
        System.out.println("quotient is "+q+" and REmainder is "+r+".");
        System.out.println("==================================================");
    }
}
