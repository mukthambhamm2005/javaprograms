public class narrowconversion {
    public static void main(String[] args) {
        System.out.println("narrowing conversion");
        System.out.println("-------------------------");
        double doubleValue=123.3654788;
        float f=(float)doubleValue;
        long l=(long)f;
        int i=(int)l;

        System.out.println("double: "+doubleValue);
        System.out.println("float: "+ f);
        System.out.println("long: "+ l);
        System.out.println("int: "+i);

    }
}
