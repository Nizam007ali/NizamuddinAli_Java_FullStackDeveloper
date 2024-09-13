package java;

interface Ia{
    void a();
}

interface Ib{
    void b();
}

class interface001 implements Ia, Ib{
    
    public void a(){
        System.out.println("this is Ia interface method");
    }
    
    public void b(){
        System.out.println("this is Ib interface method");
    }
    
    void c(){
        System.out.println("this is class method");
    }
}

public class interfaceSimple{
    public static void main(String[] args) {
        interface001 i = new interface001();
        i.a();
        i.b();
        i.c();
    }
}
