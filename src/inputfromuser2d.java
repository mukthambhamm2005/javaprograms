import java.util.Scanner;
public class inputfromuser2d {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row size");
        int m=sc.nextInt();
        System.out.println("enter the size of column");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("enter the values");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }

}
