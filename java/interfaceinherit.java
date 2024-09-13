package java;

interface A100 {

    void a();
}

interface B100 {

    void b();
}

interface C100 extends A100, B100 {

    void c();
}

class D100 implements C100 {

    public void a() {
        System.out.println("this is a interface method");
    }

    public void b() {
        System.out.println("this is b interface method");
    }

    public void c() {
        System.out.println("this is c interface method");
    }

    void d() {
        System.out.println("this is d interface method");
    }
}

class E100 extends D100 {

    void e() {
        System.out.println("this is e interface method");
    }
}

public class interfaceinherit {

    public static void main(String[] args) {
        
        E100 e1 = new E100();
        e1.a();
        e1.b();
        e1.c();
        e1.d();
        e1.e();
        
    }
    
}
