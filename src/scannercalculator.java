import java.util.Scanner;
public class scannercalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number:");
        int first=sc.nextInt();
        System.out.print("enter the second number:");
        int second=sc.nextInt();
        int sum=first+second;
        int diff=first-second;
        int product=first*second;
        int quotient=first/second;
        System.out.println("sum of two numbers :"+sum);
        System.out.println("difference of two numbers :"+diff);
        System.out.println("product of two numbers :"+product);
        System.out.println("quotient of two numbers :"+quotient);
    }
}
