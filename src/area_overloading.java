public class area_overloading {
    public static int area(int a){
        return a*a;

    }
    public static int area(int a,int b){
        return a*b;
    }
    public static float area(float a){
        return (float)3.14 * a * a;
    }
    public static void main(String[] args){
        int result=area(5);
        int result1=area(5,8);
        float result2=area(2.5f);
        System.out.println("square:"+result);
        System.out.println("rectangle:"+result1);
        System.out.println("circle:"+result2);

    }
}
