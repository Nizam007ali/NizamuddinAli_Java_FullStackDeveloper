package git;

public class aggregation{
    String city, state, country;
    int id;
    String name;
    void takeAddr(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
    void take(int id, String name, String ac, String as, String aco ){
        this.id = id;
        this.name = name;
        takeAddr(ac, as, aco);
    }
    
    void showAddr(){
        System.out.println("Address : "+this.city+" "+this.state+" "+this.country);
    }
    
    void show(){
        System.out.println("Id : "+ id);
        System.out.println("Name : "+ name);
        showAddr();
    }
    
    public static void main(String str[]){
        aggregation student1 = new aggregation();
        student1.take(1,"nizam", "Bhopal", "MP", "India");
        student1.show();
    }
}