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
public class T001_012InputoutputHourMinuteToMinutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("==============Hour Minute to Minutes==============");
        System.out.println("==================================================");
        System.out.print("Enter Hour : ");
        int h = sc.nextInt();
        System.out.print("Enter Minute (<60): ");
        int m = sc.nextInt();
        int M = h*60+m;
        System.out.println("==================================================");
        System.out.println("Hour : "+h+", Minute : "+m);
        if(m>60)
            System.err.println("Minute must be less than 60");
        System.out.println("Overall minutes : "+M+".");
        System.out.println("==================================================");
    }
}
