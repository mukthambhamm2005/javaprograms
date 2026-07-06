import java.util.Scanner;
public class switchcalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter the operator");
        String operator=sc.next();
        System.out.println("enter the second number");
        int num2=sc.nextInt();
        switch(operator){
            case "+":
                System.out.println("sum of two numbers: "+(num1+num2));
                break;
            case "-":
                System.out.println("difference of two numbers: " + (num1 - num2));
                break;
            case "*":
                System.out.println("product of two numbers: "+num1*num2);
                break;
            case "/":
                System.out.println("quotient of two numbers: "+num1/num2);
            default:
                System.out.println("invalid input");

        }
    }
}
