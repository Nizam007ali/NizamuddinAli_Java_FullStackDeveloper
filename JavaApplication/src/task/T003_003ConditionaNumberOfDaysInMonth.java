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
public class T003_003ConditionaNumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("========take two float number and out equal=======");
        System.out.println("==================================================");
        System.out.print("Enter Month(in number) : ");
        int m = sc.nextInt();
        System.out.print("Enter Year(in number) : ");
        int y = sc.nextInt();
        int d=0;
        System.out.println("==================================================");
        if(m==1) d=31;
        else if(m==2 && y%4==0) d=29;
        else if(m==2) d=28;
        else if(m==3) d=31;
        else if(m==4) d=30;
        else if(m==5) d=31;
        else if(m==6) d=30;
        else if(m==7) d=31;
        else if(m==8) d=31;
        else if(m==9) d=30;
        else if(m==10) d=31;
        else if(m==11) d=30;
        else if(m==12) d=31;
        else System.out.println("Enter valid one.");
        System.out.println("Days : "+d);
        System.out.println("==================================================");
    }
}
