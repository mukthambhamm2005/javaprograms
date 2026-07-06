import java.util.Scanner;
public class logicalassign {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //String nationality="Indian";
        System.out.println("enter your nationality");
        String nationality=sc.nextLine();

        System.out.println("enter your age");
        int age=sc.nextInt();
        if(age>18 && nationality.equalsIgnoreCase("Indian")){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("not eligible to vote");
        }
        System.out.println("enter the marks :");
        int marks=sc.nextInt();
        //System.out.println("enter the income");
        //int income=sc.nextInt();
        if(marks>=85){
            System.out.println("eligible for scholarship ");
        }
        System.out.println("enter the income");
        int income=sc.nextInt();

        if(marks>=70 && income<200000){
            System.out.println("eligible for scholarship ");
        }
        else{
            System.out.println("not eligible for scholarship");
        }
    }
}
