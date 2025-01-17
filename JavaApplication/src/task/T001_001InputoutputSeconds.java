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
public class T001_001InputoutputSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("================Seconds=to=HH:MM:SS===============");
        System.out.println("==================================================");
        System.out.print("Enter  seconds : ");
        int t = sc.nextInt(), t1 = t;
        int h = t1/(60*60);
        t1%=3600;
        int m = t1/(60);
        t1%=60;
        int s = t1;
        System.out.println("==================================================");
        System.out.println("Seconds : "+t);
        System.out.println("HH:MM:SS : "+h+":"+m+":"+s+".");
        System.out.println("==================================================");
    }
}
