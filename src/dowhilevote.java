import java.util.Scanner;
public class dowhilevote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        do{
            System.out.println("enter your age :  ");
            age=sc.nextInt();
        }while(age<=18);
        System.out.println("now you can vote");
    }
}
