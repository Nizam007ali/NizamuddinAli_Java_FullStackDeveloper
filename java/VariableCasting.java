public class VariableCasting { 
    public static void main(String args[])  
    {  
        //double->float->long->int->short->byte
        int num=160;  
        float floatNum=num;               //widening
        System.out.println(num);  
        System.out.println(floatNum);  
        float Num2=(int)floatNum;       //type casting 
        System.out.println(Num2);  
        System.out.println(floatNum);  
        byte num3=(byte)num;            //overflow
        System.out.println(num3);  
        System.out.println(num); 
        byte b1=10;  
        byte b2=14;  
        //byte c=a+b;//Compile Time Error: because a+b=24 will be int  
        byte c=(byte)(b1+b2);  
        System.out.println(c);          //adding lower type  
    }  
} 
    
    