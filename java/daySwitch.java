package git;

import java.util.Scanner;

public class daySwitch {

    public static void main(String str[]) {
        int day;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 to 7 to get day : ");
        day = s.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
