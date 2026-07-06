import java.util.Scanner;
public class dowhilepassword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String password="java123";
        String password1;
        do{
            System.out.println("enter the password");
            password1=sc.nextLine();
            if(!password.equals(password1)){
                System.out.println("password is incorrect ,please enter it again");
            }
        }while(!password.equals(password1));
        System.out.println("valid password");
    }
}
