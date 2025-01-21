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
public class T003_001ConditionalBiggerIn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("=========take three number and out big one========");
        System.out.println("==================================================");
        System.out.print("Enter a 1 number : ");
        int m = sc.nextInt();
        System.out.print("Enter a 2 number : ");
        int n = sc.nextInt();
        System.out.print("Enter a 3 number : ");
        int o = sc.nextInt(),max=0;
        System.out.println("==================================================");
        if(n>=m && n>=o) {
            max = n;
        } else if(m>=n && m>=o) {
            max = m;
        } else if(o>=m && o>=n) {
            max = o;
        } 
        System.out.println("Max is "+max);
        System.out.println("==================================================");
    }
}
