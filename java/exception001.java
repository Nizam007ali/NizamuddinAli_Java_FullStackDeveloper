package java;

public class exception001 {
    public static void main(String[] args) {
        int x = 10, y = 0, z=0;
        System.out.println("before exception");
        try{
            z = x/y;
        }
        catch(Exception e){
            System.out.println("y must not be 0");
        }
        System.out.println(z);
        System.out.println("after exception");
    }
}
