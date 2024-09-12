package git;

class C{
    final int a = 100;
    void show(){
        int a = 10;
        System.out.println("Value of local a : "+a);
    }
}

public class finalVariable {
    public static void main(String str[]){
        C c = new C();
        c.show();
        System.out.println("Value of final a : "+c.a);
    }
}
