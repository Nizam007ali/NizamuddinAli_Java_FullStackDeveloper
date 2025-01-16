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
public class J028ifelseVowel {
    public static void main(String[] args) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any charater : ");
        char c = sc.nextLine().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            result = "Vowel";
        } else {
            result = "not vowel";
        }
        System.out.println("Vowel");
        System.out.println("==================================================");
        System.out.println("Character you entered is " + c + " and it is a " + result + ".");
    }
}
