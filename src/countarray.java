public class countarray {
    public static void main(String[] args){
        int num[]={23,8,90,67,56,45};
        int countodd=0;
        int counteven=0;
        for(int i=0; i<num.length ;i++){
            if((num[i]%2)==0)
                counteven++;
            else
                countodd++;
        }
        System.out.println("even numbers : "+counteven);
        System.out.println("odd numbers : "+countodd);

    }
}
