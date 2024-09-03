package gitp;

public class forLabeledLoop {
    public static void main(String args[])  
    { 
    //by default break inner "for" loop  
        for(int i=1;i<=3;i++){  
            for(int j=1;j<=3;j++){  
                if(i==2&&j==2){  
                    break;  
                }  
                System.out.println(i+" "+j);  
            }  
        }   
    //Using Label for outer "for" loop 
        System.out.println("__________________________________________________");
        aa:  
        for(int i=1;i<=3;i++){  
            bb:  
            for(int j=1;j<=3;j++){  
                if(i==2&&j==2){  
                    break aa;  
                }  
                System.out.println(i+" "+j);  
            }  
        }   
    }
}