/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author nizam
 */
public class J007SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 9, b = 4;
        System.out.println("Before Swapping : ");
        System.out.println("==================================================");
        System.out.println("a : "+ a +" b : "+ b);
        System.out.println("==================================================");
        System.out.println("After Swapping : ");
        System.out.println("==================================================");
        a = a + b;      // a*b
        b = a - b;      // a/b
        a = a - b;      // a/b
        System.out.println("a : "+ a +" b : "+ b);
    }
}
