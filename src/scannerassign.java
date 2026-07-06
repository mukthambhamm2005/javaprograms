import java.util.Scanner;
public class scannerassign {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your name :");
        String name=sc.nextLine();
        System.out.print("enter your age :");
        int age=sc.nextInt();
        System.out.print("enter your height :");
        double height=sc.nextDouble();
        System.out.print("are you student ?(true/false) :");
        Boolean isStudent=sc.nextBoolean();

        System.out.println("-----------user details-------------");
        System.out.println("name : "+name );
        System.out.println("age : "+age);
        System.out.println("height : "+height);
        System.out.println("isStudent : "+isStudent);

    }
}
