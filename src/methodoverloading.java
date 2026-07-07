public class methodoverloading {
    public static int add(int a,int b){
        return a+b;

    }
    public static int add(int a,int b ,int c) {
        return a + b + c;
    }
    public static void main(String[] args){
    int result=add(15,20);
    int result2=add(15,20,56);
        System.out.println("addition of 2 :"+result);
        System.out.println("addition of 3 :"+result2);
    }
}

