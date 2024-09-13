package java;
//Instance Variable
public class staticVariable001 {
    String name;
    String enroll;
    static String clg = "LNCT";
    public static void main(String args[]) {
        System.out.println(clg);
        System.out.println(staticVariable001.clg);
        staticVariable001 s = new staticVariable001();
        System.out.println(s.clg);
    }
}
