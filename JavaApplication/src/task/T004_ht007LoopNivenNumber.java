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
public class T004_ht007LoopNivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("============ Loop print Niven Number =============");
//number divisible by its sum
        System.out.println("==================================================");
        System.out.print("Number : ");
        int n = sc.nextInt(), sum = 0;
        for(int i=n; i>0; i/=10) {
            int r = i%10;
            sum+=r;
        }
        System.out.println("Sum of its digits : "+sum);
        if(n%sum==0) System.out.println(n+" is a Niven number");
        else System.out.println(n+" is not a Niven number");
        System.out.println("==================================================");
    }
}
