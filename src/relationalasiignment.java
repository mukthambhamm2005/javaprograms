import java.util.Scanner;
public class relationalasiignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("a is greater than b");
        }
        else if(a<b){
            System.out.println("a is smaller than b");
        }
        else {
            System.out.println("a and b are equal");
        }
        System.out.println("enter the value of c");
        int c=sc.nextInt();
        if(c>0){
            System.out.println("c is positive");

        }
        else if(c<0){
            System.out.println("c is negative");
        }
        else {
            System.out.println("c is zero");
        }
        System.out.println("enter the value of number");
        int number=sc.nextInt();
        if(number>1 && number<100){
            System.out.println("number lies btw 1 and 100");
        }
        else{
            System.out.println("false");
        }


    }
}
