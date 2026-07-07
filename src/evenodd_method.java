public class evenodd_method {
    public static void checkevenodd(int n){
        if((n%2)==0){
            System.out.println(n+" is even");
        }
        else
            System.out.println(n+" is odd");
    }
    public static void main(String[] args){
        checkevenodd(2);
        checkevenodd(25);
        checkevenodd(9);
        checkevenodd(68);
    }
}
