public class maxelement {
    public static void main(String[] args){
        int num[]={89,76,107,9,34};
        int max=num[0];
        for(int i:num){
            if(num[i]>max)
                max=num[i];

        }
        System.out.println("max : "+max);
    }
}
