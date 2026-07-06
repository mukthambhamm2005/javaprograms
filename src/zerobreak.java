import java.util.Scanner;
public class zerobreak {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        while(true) {
            System.out.println("enter the number ;");
            num = sc.nextInt();

            if (num == 0) {
                break;

            }
            System.out.println(num);
        }

    }
}
