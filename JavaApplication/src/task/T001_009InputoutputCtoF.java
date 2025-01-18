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
public class T001_009InputoutputCtoF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = 0;
        System.out.println("==================================================");
        System.out.println("================5=input=Sum=of=Odds===============");
        System.out.println("==================================================");
        System.out.print("Enter celsius : ");
        double c = sc.nextDouble();
        f = (float)c*9/5+32.0;
        System.out.println("==================================================");
        System.out.println("Celsius you entered is "+c+".");
        System.out.println("Farenheit is "+f+".");
        System.out.println("==================================================");
    }
}
