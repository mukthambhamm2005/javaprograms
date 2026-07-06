public class dowhileex {
    public static void main(String[] args) {
        int i=1,sum=0;
        do{
            sum+=i;
            System.out.println(sum);

            i++;
        }while(i<=10);
        System.out.println("final sum of "+(i-1) +" numbers  "+sum);
    }
}
