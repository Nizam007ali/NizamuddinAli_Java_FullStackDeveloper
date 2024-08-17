public class assignmentOperator {
    public static void main(String[] args) {
        int a=10;                       //equal, 10
        System.out.println(a);
        //arithmetic
        System.out.println(a+=2);       //add equal, 12
        System.out.println(a-=4);       //Subtract equal, 8
        System.out.println(a*=5);       //multiply equal, 40
        System.out.println(a/=4);       //didvide equal, 10
        System.out.println(a%=8);       //modulous equal, 2
        //bitwise
        System.out.println(a&=22);      //and equal, 2
        System.out.println(a|=12);      //or equal, 14
        System.out.println(a>>=1);      //left shift equal, 7
        System.out.println(a<<=2);      //right shift equal, 28 
    }
}
