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
public class T004_ht003Loop80To70Alternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("========== Loop print 80 to 70 alternate =========");
        System.out.println("==================================================");
        for(int i=80; i>=70; i-=2) {
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("==================================================");
    }
}
