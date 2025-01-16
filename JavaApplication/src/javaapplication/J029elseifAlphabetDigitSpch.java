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
public class J029elseifAlphabetDigitSpch {
    public static void main(String[] args) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any charater : ");
        char c = sc.nextLine().charAt(0);
        if(c>='a' && c<='z'){
            result = "big alphabet";
        } else if(c>='A' && c<='Z') {
            result = "small alphabet";
        } else if(c>='0' && c<='9') {
            result = "digit";
        } else {
            result = "special character";
        }
        System.out.println("Alphabet/Digit/SpecialCharacter");
        System.out.println("==================================================");
        System.out.println("Character you entered is " + c + " and it is a " + result + ".");
    }
}
