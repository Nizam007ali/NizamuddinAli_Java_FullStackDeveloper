import java.util.Scanner;

public class naturalNumberSimpleIf {
    public static void main(String args[])  
    { 
        
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number : ");
        n = s.nextInt();
        if(n>0)
            System.out.println("Number is natural number.");
        
    }
}

