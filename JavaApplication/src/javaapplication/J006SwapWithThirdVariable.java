/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author nizam
 */
public class J006SwapWithThirdVariable {
    public static void main(String[] args) {
        int a = 9, b = 4, c;
        System.out.println("Before Swapping : ");
        System.out.println("==================================================");
        System.out.println("a : "+ a +" b : "+ b);
        System.out.println("==================================================");
        System.out.println("After Swapping : ");
        System.out.println("==================================================");
        c = a;
        a = b;
        b = c;
        System.out.println("a : "+ a +" b : "+ b);
    }
}
