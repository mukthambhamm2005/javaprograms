import java.util.Scanner;
public class travel_exception {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        String arr[]={"paris","tokyo","sydney"};
        try{
            System.out.println("the place is : "+arr[n]);
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println(" array out of bound  "+a);

        }
        System.out.println("program finished successfully  !");
    }
}
