/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author nizam
 */
public class J005Student {
    public static void main(String[] args) {
        String n = "Nizam", r = "S001";
        int m = 88, p = 76, c =81, h = 71, e = 75;
        float t = m+p+c+h+e, per = t/5;
        System.out.println("Name of Student : "+ n);
        System.out.println("Roll number of Student : "+ r);
        System.out.println("==================================================");
        System.out.println("Marks : ");
        System.out.print("Maths : "+ m);
        System.out.print(", Physics : "+ p);
        System.out.print(", Chemistry : "+ c);
        System.out.print(", English : "+ e);
        System.out.println(", Hindi : "+ h);
        System.out.println("==================================================");
        System.out.println("Total Marks : "+ t);
        System.out.println("==================================================");
        System.out.println("Percentage : "+ per);
        System.out.println("==================================================");
    }
}
