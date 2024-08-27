package git;
import java.util.Scanner;

public class bloodDonateNestedIf {
    
    public static void main(String args[])  
    { 

        int age, weight;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter age : ");
        age = s.nextInt();
        System.out.println("Enter weight : ");
        weight = s.nextInt();
        if(age>17 || age<50){
            if(weight>60){
                System.out.println("You can donate blood.");
            }
            else{
                System.out.println("Weight must be more than 60 to donate blood.");
            }
        }
        else
            System.out.println("Age must be between 18 and 50.");
        
    }
}
