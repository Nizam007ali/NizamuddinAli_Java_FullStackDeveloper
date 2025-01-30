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
public class T004_ht009LoopTwoDigitNumberSumOfSumOFDigitAndProductOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("====== Loop print two digit Special Number =======");
//number= sum(its digits sum is equal to its digit product )
        System.out.println("==================================================");
        System.out.print("Number : ");
        int n = sc.nextInt(), sum = 0, psum = 1, dsum = 0;
        for(int i=n; i>0; i/=10) {
            int r = i%10;
            dsum+=r;
            psum*=r;
        }
        System.out.println("Sum of its digits : "+dsum);
        System.out.println("Product of its digits : "+psum);
        sum = dsum+psum;
        if(sum==n) System.out.println(n+" is a special number");
        else System.out.println(n+" is not a special number");
        System.out.println("==================================================");
    }
}
