package git;
import java.util.Scanner;

class emp {

    int id, sal = 30000;
    String name, company = "ABC.ltd";

    public emp() {               // default constructor
        id = 001;
        name = "Nizam";
        sal = 50000;
    }

    public emp(int i, String n, int s) {               // parameterised constructor
        id = i;
        name = n;
        sal = s;
    }

    public emp(int i, String n) {               // parameterised constructor
        id = i;
        name = n;
    }

    double hra() {
        return sal * 0.2;
    }

    double ta() {
        return sal * 0.1;
    }

    double da() {
        return sal * 0.1;
    }

    double totalIncentive() {
        return hra() + ta() + da();
    }

    double Gsal() {
        return sal + totalIncentive();
    }

    void show() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Company : " + company);
        System.out.println("Salary : " + sal);
        System.out.println("Total incentive: " + totalIncentive());
        System.out.println("Gross salary : " + Gsal());
        System.out.println("_______________________________________________________________");
    }
}

public class constructor {

    public static void main(String[] str) {
        emp e1 = new emp();                             //default constructor object
        e1.show();
        emp e2 = new emp(102, "nitish", 40000);   //paremeterised constructor object
        e2.show();
        emp e3 = new emp(103, "neeraj");   //paremeterised constructor object
        e3.show();
        
        int i, s;
        String n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your Id : ");
        i = sc.nextInt();
        System.out.print("Enter your name : ");
        n = sc.next();
        System.out.print("Enter your salary : ");
        s = sc.nextInt();
        
        emp e4 = new emp(i, n, s);   //paremeterised constructor object
        e4.company = "XYZ.ltd";
        e4.show();
    }
}
