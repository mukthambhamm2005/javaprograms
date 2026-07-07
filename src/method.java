public class method {
    public static void changeArr(int[] arr){
        arr[0]=arr[0]+10;
    }
    public static void main(String[] args){
        int array[]={10,20,30};
        changeArr(array);
        System.out.println(array[0]);

    }
}
