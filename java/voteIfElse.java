import java.util.Scanner;
public class voteIfElse { 
    public static void main(String args[])  
    {
        int age;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age : ");
        age = s.nextInt();
        if(age<18){
            System.out.println("You are not eligible for vote");  
        }
        else{
            System.out.println("You are eligible to vote"); 
        }
    }  
} 