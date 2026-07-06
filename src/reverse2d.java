public class reverse2d {
    public static void main(String[] args){
        int arr[][]=new int[2][3];
        int arr2[][] ={{2,3,4},{5,6,7},{8,9,0}};
        for(int i=arr2.length-1;i>=0;i--){
            for(int j=arr2.length-1;j>=0;j--){
                System.out.print(arr2[i][j]+ "  ");
            }
            System.out.println();
        }

    }

}
