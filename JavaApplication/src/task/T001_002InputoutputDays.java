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
public class T001_002InputoutputDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("================Days=to=DD/MM/YYYY================");
        System.out.println("==================================================");
        System.out.print("Enter days : ");
        int D = sc.nextInt(), d1 = D;
        int y = d1/(365);
        d1%=365;
        int m = d1/(30);
        d1%=30;
        int d = d1;
        System.out.println("==================================================");
        System.out.println("Days : "+D);
        System.out.println("DD/MM/YYYY : "+d+" days, "+m+" month, "+y+" year.");
        System.out.println("==================================================");
    }
}
