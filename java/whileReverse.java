package git;
import java.util.Scanner;

public class whileReverse {
    public static void main(String str[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to get it reverse : ");
        int n = sc.nextInt(), t=n, r=0;
        while(true){
            int l = t % 10;     
            t/=10;              
            r = r * 10 + l;     
            if(t==0){
                break;
            }
        }
        System.out.println("The reverse of "+n+" is "+r);
    }   
}
