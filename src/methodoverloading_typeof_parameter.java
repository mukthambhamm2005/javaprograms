public class methodoverloading_typeof_parameter {
    public static int add(int a,int b){
        return a+b;

    }
    public static float add(float a,float b) {
        return a + b ;
    }
    public static void main(String[] args){
        int result = add(15,20);
        float result2 = add(15.5f,20.6f);
        System.out.println("addition of 2 :"+result);
        System.out.println("addition of 3 :"+result2);
    }
}

