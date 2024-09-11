package git;

class addition {
    
    int add(int x){
        int sum=0;
        sum = sum+x;
        return sum;
    }
    int add(int x, int y){
        int sum=0;
        sum = y+x;
        return sum;
    }
    double add(int x, double y){
        double sum=0;
        sum = (double)x+y;
        return sum;
    }
    double add(double y, int x){
        double sum=0;
        sum = (double)x+y;
        return sum;
    }
    double add(double x, double y){
        double sum=0;
        sum = x+y;
        return sum;
    }
    
}
public class methodOverloadingAdd {
    public static void main(String str[]){
        int s;
        double s1;
        addition a = new addition();
        s = a.add(98);
        System.out.println("a.add(98) : "+ s);
        s = a.add(54,35);
        System.out.println("a.add(54,35) : "+ s);
        s1 = a.add(35,90.4);
        System.out.println("a.add(35,90.4) : "+ s1);
        s1 = a.add(53.2,81);
        System.out.println("a.add(35,90.4) : "+ s1);
        s1 = a.add(40.3,97.5);
        System.out.println("a.add(40.3,97.5) : "+ s1);
    }
}
