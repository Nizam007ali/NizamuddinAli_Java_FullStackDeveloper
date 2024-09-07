package git;
public class breakContinue {
    public static void main(String str[]){
        for(int i = 0; i <= 10; i++){
            if(i==5){                         //break for only when i is 5
                continue;
            }
            if(i==8){
                break;
            }
            System.out.println(i);          //break loop permanently after i is 8
        }
    }
}
