package git;
import java.util.Scanner;

class student{
    int id;
    String name, email, course;
    
    Scanner sc = new Scanner(System.in);
    
    void inputData(int i,String n){
        id = i;
        name = n;
        System.out.println("Enter you email : ");   // iniialization in method
        email = sc.next();
    }
    
    void showData(){
        System.out.println("id : "+id);
        System.out.println("name : "+name);
        System.out.println("course  : "+course);
        System.out.println("eMail : "+email);
    }
}

public class classObject {
    public static void main(String str[]){
        int id;
        String name;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your id :");
        id = s.nextInt();
        System.out.print("Enter your name :");
        name = s.next();
        
        student s1 = new student();             // Creating s1 object of student class 
        s1.inputData(id, name);                 // initialization through method
        s1.course = "Mca";                      // initialization through reference
        s1.showData();
        
    }
}
