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
public class T004_ht010LoopDuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("====== Loop print two digit Special Number =======");
//number= it contains 0
        System.out.println("==================================================");
        System.out.print("Number : ");
        int n = sc.nextInt();
        boolean isDuck=false;
        for(int i=n; i>0; i/=10) {
            int r = i%10;
            if(r==0) isDuck = true;
        }
        if(isDuck) System.out.println(n+" is a duck number");
        else System.out.println(n+" is not a duck number");
        System.out.println("==================================================");
    }
}
