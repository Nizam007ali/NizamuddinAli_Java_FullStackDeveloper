package git;

class A1{
    public void show(){
        System.out.println("A class show method.");
    }
}

class B1 extends A1{
    public void show(){
        System.out.println("B class show method.");
    }
}

public class methodOverriding {
    public static void main(String str[]){
        A1 a = new A1();
        a.show();
        B1 b = new B1();
        b.show();
    }
}
