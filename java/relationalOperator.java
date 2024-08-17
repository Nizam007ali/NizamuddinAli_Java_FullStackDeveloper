public class relationalOperator {
    public static void main(String args[]){
        boolean b;
        b = (5>9);
        System.out.println(b);      // false, greater 
        b = (7<9);
        System.out.println(b);      // true, less than
        b = (11>=5);
        System.out.println(b);      // true, greater than equal
        b = (48<=42);
        System.out.println(b);      // false, less than equal
        b = (5==5);
        System.out.println(b);      // false, is equal
        b = (5!=9);
        System.out.println(b);      // false, is not equal
    }
}
