import java.util.Scanner;
public class dowhileage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
        do{
            System.out.println("enter your age : ");
            age=sc.nextInt();
            if(age<=0){
                System.out.println("Invalid age, please enter again");
            }
        }while(age<=0);
        System.out.println("valid");


    }
}
