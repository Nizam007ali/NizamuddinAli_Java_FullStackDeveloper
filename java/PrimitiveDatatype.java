public class PrimitiveDatatype {
    public static void main(String args[])  
    {  
        String name = "Nizamuddin Ali";         //non-primitive
        boolean isMale = true;                  //1 bit     
        byte age = 24;                          //1 byte    -128 to 127
        short salary = 32000;                   //2 byte    -2^15 to 2^15-1
        int Age = 24;                           //4 byte    -2^31 to 2^31-1
        long Salary = 35000;                    //8 byte    -2^63 to 2^63-1
        float pi = 3.14f;                       //4 byte    
        double height = 6.2;                    //8 byte
        char favLetter = 'n';                   //2 byte
        System.out.println("Your name : "+name);
        System.out.println("Are you male : "+isMale);
        System.out.println("Your age : "+age);
        System.out.println("your salary : "+salary);
        System.out.println("Your Age : "+Age);
        System.out.println("your Salary : "+Salary);
        System.out.println("pi value : "+pi);
        System.out.println("Your height in foot : "+height);
        System.out.println("Your favourite letter : "+favLetter);
    }
}
