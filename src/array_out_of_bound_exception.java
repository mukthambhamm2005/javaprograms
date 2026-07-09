public class array_out_of_bound_exception {
    public static void main(String[] args){
        System.out.println("hellooo");
        int arr[]={1,2,3,4,5};
        try{
            System.out.println(arr[4]);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("byeee");
    }
}
