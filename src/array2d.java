public class array2d {
    public static void main(String[] args){
        int arr[][]=new int[2][3];
        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2.length;j++) {
                System.out.print(arr2[i][j] + " ");
                sum=sum + arr2[i][j];

            }
            System.out.println();

        }
        System.out.println("sum = " +sum);

    }
}
