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
public class T004_ht006LoopAbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("=========== Loop print Abundant Number ===========");
//sum of factors of number > number
        System.out.println("==================================================");
        System.out.print("Number : ");
        int n = sc.nextInt(), sum = 0;
        System.out.print("Factor of "+n+" : ");
        for(int i=1; i<n; i++) {
            if(n%i==0) {
                System.out.print(i+" ");
                sum+=i;
            }
        }
        System.out.println("");
        System.out.println("Sum of Factors : "+sum);
        if(sum>n) System.out.println("As "+sum+" > "+n+" so "+n+" is an Abundant number");
        else System.out.println("As "+sum+" < "+n+" so "+n+" is not an Abundant number");
        System.out.println("==================================================");
    }
}
