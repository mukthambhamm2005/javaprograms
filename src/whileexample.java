public class whileexample {
    public static void main(String[] args) {
        int i=1,sum=0;


        while(i<=5){
            sum+=i;
            i++;
            System.out.println("sum of "+i+" numbers is "+sum);
        }
        System.out.println("final sum of 5 numbers  " +sum);
    }
}
