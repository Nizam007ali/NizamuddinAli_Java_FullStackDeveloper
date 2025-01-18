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
public class T001_006Inputoutput5IntCountPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pc = 0, nc = 0;
        System.out.println("==================================================");
        System.out.println("==========5=input=Count=Positive=Negative=========");
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
        if(n1>=0){
            pc++;
        } else {
            nc++;
        }
        if(n2>=0){
            pc++;
        } else {
            nc++;
        }
        if(n3>=0){
            pc++;
        } else {
            nc++;
        }
        if(n4>=0){
            pc++;
        } else {
            nc++;
        }
        if(n5>=0){
            pc++;
        } else {
            nc++;
        }
        System.out.println("==================================================");
        System.out.println("Numbers you entered are "+n1+", "+n2+", "+n3+", "+n4+", "+n5+".");
        System.out.println("Count of negative number is "+nc+".");
        System.out.println("Count of positive number is "+pc+".");
        System.out.println("==================================================");
    }
}
