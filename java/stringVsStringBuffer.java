package git;

public class stringVsStringBuffer {
    public static void main(String args[]){
        String s1=new String("hello");
        String s2=new String("hello");
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true
        
        StringBuffer s3=new StringBuffer("hello");
        StringBuffer s4=new StringBuffer("hello");
        System.out.println(s3==s4);//false
        System.out.println(s3.equals(s4));//false
    }
    
}
