public class UnaryOperator {
    public static void main(String args[]) {  
        int a =10 ;
        int b = 5;
        int c = -8;
        boolean d=false;
        System.out.println(b++);        //print 5 (value become 6) 
        System.out.println(++b);        //print 7 (value become 7) 
        System.out.println(a--);        //print 10 (value become 9) 
        System.out.println(--a);        //print 8 (value become 8) 
        System.out.println(~a);         //-9 (minus of total positive value which starts from 0)  
        System.out.println(~c);         //7 (positive of total minus, positive starts from 0)  
        System.out.println(!d);         //true (opposite of boolean value)  
    }
}