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
public class T001_005Inputoutput1to12MonthName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("=====================Month name===================");
        System.out.println("==================================================");
        System.out.print("Enter  month (1 to 12) : ");
        int m = sc.nextInt();
        System.out.println("==================================================");
        System.out.println("Month : "+m);
        String M = "";
        if(m==1)
            M = "January";
        else if(m==2)
            M = "February";
        else if(m==3)
            M = "March";
        else if(m==4)
            M = "April";
        else if(m==5)
            M = "May";
        else if(m==6)
            M = "June";
        else if(m==7)
            M = "July";
        else if(m==8)
            M = "Augast";
        else if(m==9)
            M = "September";
        else if(m==10)
            M = "October";
        else if(m==11)
            M = "November";
        else if(m==12)
            M = "December";
        else
            System.out.println("Enter valid month");
        System.out.println("Name of months : "+M+".");
        System.out.println("==================================================");
    }
}
