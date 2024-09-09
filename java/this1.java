package git;

class teacher {

    int id, salary;
    String name;

    void data(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void show() {
        System.out.println("id : " + id);
        System.out.println("name : " + name);
        System.out.println("salary : " + salary);
    }
}

public class this1 {

    public static void main(String str[]) {
        teacher t1 = new teacher();
        t1.data(1, "tarun", 25000);
        t1.show();
        t1.data(2, "varun", 23000);
        t1.show();
    }
}
