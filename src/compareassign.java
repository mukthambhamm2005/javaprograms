import java.sql.SQLOutput;
import java.util.Scanner;
public class compareassign {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a1=10;
        System.out.print("enter a number");
        int b=sc.nextInt();
        System.out.println(a1>b);
        double v=2,u=3,a=5;
        double s=(v*v-u*u)/2*a;

        System.out.println(s);


    }
}

