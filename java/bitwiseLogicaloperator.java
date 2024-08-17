public class bitwiseLogicaloperator {
    public static void main(String args[])  
    { 
        // bitwise                                                     
        // a       b       a&b     a|b     a^b                         
        // 0       0       0       0       0                           
        // 0       1       0       1       1                                      
        // 1       0       0       1       1                           
        // 1       1       1       1       0                           
        System.out.println(21&13);      //5     10101   01101   00101
        System.out.println(21|13);      //29    10101   01101   11101
        System.out.println(21^13);      //24    10101   01101   11000

        // logical
        // a       b       a&&b        a||b
        // f       f       f           f
        // f       t       f           t
        // t       f       f           t
        // t       t       t           t

        System.out.println(false&&true);        //false
        System.out.println(true||false);        //true

    }
}
