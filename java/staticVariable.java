package git;

class var1 {

    int count = 0;
    static int count1 = 0;

    var1() {
        count++;            // everytime count will get new memory, whenver object created, so it always come 1
        System.out.println("count++ : " + count);
        count1++;           // everytime count1 increase  whenver object created 
        System.out.println("count1++ : " + count1);

    }
}

public class staticVariable {

    public static void main(String str[]) {
        var1 v1 = new var1();
        var1 v2 = new var1();
        var1 v3 = new var1();
    }
}
