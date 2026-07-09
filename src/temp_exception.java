import java.util.Scanner;
public class temp_exception {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the temp in celcius :");
        int temp=sc.nextInt();
        System.out.println("enter the divisor :");
        int div=sc.nextInt();
        float res;
        try{
            res=temp/div;
            System.out.println("converted ratio :"+(float)res);
        }catch(ArithmeticException a){
            System.out.println("Conversion failed : Invalid divisor " +a);
        }
        System.out.println("program finished successfully!");
    }
}
