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
public class J032SwitchVowel {
    public static void main(String[] args) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("Vowel");
        System.out.println("==================================================");
        System.out.print("Enter character : ");
        char c = sc.nextLine().charAt(0);
        switch(c){
            case 'a' : case 'A':
                result = "it's a vowel";
                break;
            case 'e': case 'E':
                result = "it's a vowel";
                break;
            case 'i': case 'I':
                result = "it's a vowel";
                break;
            case 'o': case 'O':
                result = "it's a vowel";
                break;
            case 'u': case 'U':
                result = "it's a vowel";
                break;
            default:
                result = "it's not a vowel";
                break;
        }
        System.out.println(result);
    }
}
