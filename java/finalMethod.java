package git;

class A3{
    final void show(){                  // final class can ot be overide
        System.out.println("This is A3 class method.");
    }
}

class B3 extends A3{
    void show(){
        System.out.println("This is B3 class method.");
    }
}

public class finalMethod {
    public static void main(String str[]){
        A3 a = new A3();
        a.show();
        B3 b = new B3();    
        // b.show();                       // this will give exception of overriding
    }
}
