import java.util.Scanner;
public class switchmonth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the month number");
        int month=sc.nextInt();
        switch(month){
            case 1:
                System.out.println("January has 31 days");
                break;
            case 2:
                System.out.println("February has 28 days");
                break;
            case 3:
                System.out.println("march has 31 days");
                break;
            case 4:
                System.out.println("April has 30 days");
                break;
            case 5:
                System.out.println("may has 31 days");
                break;
            case 6:
                System.out.println("june has 30 days");
                break;
            case 7:
                System.out.println("july has 31 days");
                break;
            case 8:
                System.out.println("august has 31 days");
                break;
            case 9:
                System.out.println("September has 30 days");
                break;
            case 10:
                System.out.println("October has 31 days");
                break;
            case 11:
                System.out.println("November has 30 days");
                break;
            case 12:
                System.out.println("December has 31 days");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
