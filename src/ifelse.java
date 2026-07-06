import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String name=sc.nextLine();
        System.out.println("enter the branch");
        String branch=sc.nextLine();
        System.out.println("enter the age");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("you can vote");
        } else {
            System.out.println("you are not eligible to vote");
        }
        System.out.println("enter the marks");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("grade A");
        }
        else if(marks>=75){
            System.out.println("grade B");
        }
        else if(marks>=50){
            System.out.println("grade C");
        }
        else if(marks>=35){
            System.out.println("grade D");
        }
        else{
            System.out.println("fail");
        }
        System.out.println("-----------student details----------");
        System.out.println("name:"+name);
        System.out.println("branch:"+branch);
        System.out.println("age:"+age);
        System.out.println("marks:"+marks);

    }
}
