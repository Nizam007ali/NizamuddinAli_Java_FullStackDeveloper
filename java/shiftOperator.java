public class shiftOperator {
    public static void main(String args[])  
    { 
        System.out.println(10<<2);      //10*2^2=40
        System.out.println(-5<<3);       //-5*2^3=-40 

        //For positive number, >> and >>> works same  
        System.out.println(5>>2);       //10/2^2=10/4=2  
        System.out.println(5>>>2);      //10/2^2=10/4=2

        //For negative number, >>> changes parity bit (MSB) to 0  
         System.out.println(-40>>2);    //-40/2^2=-10
         System.out.println(-40>>>2);   //it give bitwise operator
    }
}
