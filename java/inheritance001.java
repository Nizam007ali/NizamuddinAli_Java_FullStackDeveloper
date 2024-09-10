package git;

class A{
    public int x = 15;
    A(){
        System.out.println("This is A default constructor");
    }
    A( int x){
        this.x = x;
        System.out.println("This is A parameterised constructor");
    }
    void show(){
        System.out.println("X is "+x);
    }
}

class B extends A{
    public int b=20;
    B(){
        System.out.println("This is B default constructor");
    }
    B(int a, int b){
        super(a);
        this.b=b;
        System.out.println("This is B parameterised constructor"+b);
    }
    void show(){
        super.show();                       //super keyword to call parent class attributes
        System.out.println("b is "+b);
    }
}

public class inheritance001 {
    public static void main (String str[]){
        A a = new A();
        System.out.println("--------------------------------------------------");
        a.show();
        System.out.println("--------------------------------------------------");
        A a1 = new A(10);
        System.out.println("--------------------------------------------------");
        a1.show();
        System.out.println("--------------------------------------------------");
        B b = new B();
        System.out.println("--------------------------------------------------");
        b.show();
        System.out.println("--------------------------------------------------");
        B b1 = new B(5,10);
        System.out.println("--------------------------------------------------");
        b1.show();
    }
}
