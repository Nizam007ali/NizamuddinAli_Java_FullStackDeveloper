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
public class T004_ht008LoopSpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("============= Loop print Spy Number ==============");
//number: its digits sum is equal to its digit product 
        System.out.println("==================================================");
        System.out.print("Number : ");
        int n = sc.nextInt(), sum = 0, psum = 1;
        for(int i=n; i>0; i/=10) {
            int r = i%10;
            sum+=r;
            psum*=r;
        }
        System.out.println("Sum of its digits : "+sum);
        System.out.println("Product of its digits : "+psum);
        if(sum==psum) System.out.println(n+" is a spy number");
        else System.out.println(n+" is not a spy number");
        System.out.println("==================================================");
    }
}
