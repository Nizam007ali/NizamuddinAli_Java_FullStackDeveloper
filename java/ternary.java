import java.util.Scanner;

public class ternary {
    public static void main(String args[])  
    { 
        int a,b,ch,t;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter first number : ");
        a = s.nextInt();
        System.out.println("Enter second number : ");
        b = s.nextInt();
        System.out.println("Choice : \n\t1. addition\n\t2. substraction\n\t3. multiplication\n\t4. division");
        ch = s.nextInt();
        
        t = ((ch==1)?(a+b):((ch==2)?(a-b):((ch==3)?(a*b):((ch==4)?(a/b):0))));
        System.out.println("Total is : "+t);
        
    }
}