/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class J031nestedifBigSmallAlphabet {
    public static void main(String[] args) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("Big|Small Alphabet");
        System.out.println("==================================================");
        System.out.print("Enter character : ");
        char c = sc.nextLine().charAt(0);
        if(c>='a'){
            if(c<='z'){
                result = "a small alphabet";
            }  
        } else if(c>='A'){
            if(c<='Z'){
                result = "a big alphabet";
            }  
        } else {
            result = "not an alphabet";
        } 
        System.out.println("The character you entered is " +c+ ".\nIt's " +result );
    }
}
