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
public class T001_008Inputoutput5IntSumSumOddsSumEvens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ototal = 0, etotal = 0, total = 0;
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
        if(n1%2==1){
            ototal+=n1;
            total+=n1;
        } else {
            etotal+=n1;
            total+=n1;
        }
        if(n2%2==1){
            ototal+=n2;
            total+=n2;
        } else {
            etotal+=n2;
            total+=n2;
        }
        if(n3%2==1){
            ototal+=n3;
            total+=n3;
        } else {
            etotal+=n3;
            total+=n3;
        }
        if(n4%2==1){
            ototal+=n4;
            total+=n4;
        } else {
            etotal+=n4;
            total+=n4;
        }
        if(n5%2==1){
            ototal+=n5;
            total+=n5;
        } else {
            etotal+=n5;
            total+=n5;
        }
        System.out.println("==================================================");
        System.out.println("Numbers you entered are "+n1+", "+n2+", "+n3+", "+n4+", "+n5+".");
        System.out.println("Sum is "+total+".");
        System.out.println("Sum of odds is "+ototal+".");
        System.out.println("Sum of evens is "+etotal+".");
        System.out.println("==================================================");
    }
}
