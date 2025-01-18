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
public class T001_011Inputoutput5Intsum30Od30Exist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        boolean b = false;
        System.out.println("==================================================");
        System.out.println("================5=input=Sum=of=Odds===============");
        System.out.println("==================================================");
        System.out.print("Enter first numbers : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second numbers : ");
        int n2 = sc.nextInt();
        System.out.print("Enter third numbers : ");
        int n3 = sc.nextInt();
        System.out.print("Enter fourth numbers : ");
        int n4 = sc.nextInt();
        System.out.print("Enter five numbers : ");
        int n5 = sc.nextInt();
        total = n1+n2+n3+n4+n5;
        if(total==30 || n1==30 || n2==30 || n3==30 || n4==30 || n5==30)
            b=true;
        System.out.println("==================================================");
        System.out.println("Numbers you entered are "+n1+", "+n2+", "+n3+", "+n4+", "+n5+".");
        System.out.println("Sum is "+total+".");
        if(b)
            System.out.println("Either sum is 30 or 30 exists.");
        else
            System.out.println("Neither sum is 30 nor 30 exists.");
        System.out.println("==================================================");
    }
}
