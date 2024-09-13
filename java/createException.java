package java;

import java.util.InputMismatchException;
import java.util.Scanner;

class invalidAgeException extends Throwable {

    private String msg;

    public invalidAgeException(String message) {
        msg = message;
    }

    public String sendMsg() {
        return msg;
    }
}

public class createException {

    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age : ");
            age = sc.nextInt();

            if (age < 1 || age > 120) {
                invalidAgeException a = new invalidAgeException("invalid age");
                throw a;
            }
            System.out.println("valid age");
        } catch (invalidAgeException ae) {
            System.out.println("" + ae.sendMsg());
        } catch (InputMismatchException e) {
            System.out.println("Value must be integer");
        } 
    }
}
