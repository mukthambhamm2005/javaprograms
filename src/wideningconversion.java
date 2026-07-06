public class wideningconversion {
    public static void main(String[] args) {
        System.out.println("widening conversion");
        System.out.println("---------------------------");
        byte byteValue=10;
        short shortValue=byteValue;
        int intValue=shortValue;
        long longValue=intValue;
        float floatValue=longValue;
        double doubleValue=floatValue;

        System.out.println("int "+intValue);
        System.out.println("long "+longValue);
        System.out.println("float "+floatValue);
        System.out.println("double "+doubleValue);
    }
}
