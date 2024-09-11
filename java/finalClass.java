package git;

//final class A2{                           // final class cannot extend to anyother class
//    void show(){
//        System.out.println("This is A2 class method.");
//    }
//}
//
//class B2 extends A2{
//    void show(){
//        System.out.println("This is B2 class method.");
//    }
//}

class A2{
    void show(){
        System.out.println("This is A2 class method.");
    }
}

final class B2 extends A2{
    void show(){
        System.out.println("This is B2 class method.");
    }
}

public class finalClass {
    public static void main(String str[]){
        A2 a = new A2();
        a.show();
        B2 b = new B2();
        b.show();
    }
}
