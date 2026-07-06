import java.util.Scanner;
public class whilemultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int i=1,mul=0;
        System.out.println("multiplication table of "+ num);
        while(i<=10){
            mul=i*num;
            System.out.println(num+"*"+i+"="+ mul);
            i++;

        }
    }
}
