import java.util.Scanner;
public class userinputarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter "+n+" values");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i:arr){
            System.out.println(i);
        }

    }
}
