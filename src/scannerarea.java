import java.util.Scanner;
public class scannerarea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the width:");
        int width=sc.nextInt();
        System.out.println("enter the height:");
        int height=sc.nextInt();
        int area=width*height;
        System.out.println("area:"+area);
    }

}
