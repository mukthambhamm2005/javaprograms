public class assignoperatorlogical {
    public static void main(String[] args) {
        int age=25;
        System.out.println(age>18 && age<30);
        System.out.println(age>18 || age>30);
        //assingment operator

        int x=10;
        x+=5;

        System.out.println(x);
        x-=3;
        System.out.println(x);
        x*=4;
        System.out.println(x);

        //unary operator
        int y=5;
        System.out.println(y++);
        System.out.println(y);
        System.out.println(++y);

    }
}
