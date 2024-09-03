package git;
import java.util.Scanner;

public class forNestedMatrix {
    public static void main(String args[])  
    {   
        int r, c, k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row of matrix : ");
        r = sc.nextInt();
        System.out.print("Enter column of matrix : ");
        c = sc.nextInt();
        System.out.println("__________________________________________________________");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                k++;
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}