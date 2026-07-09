public class throw_method {
    public static void main(String[] args) {
        int age = 15;
        System.out.println(age);
        if (age<18) {
            throw new ArithmeticException("you are not eligible to vote");
        }
        System.out.println("Eligible");
        System.out.println("end of code");
    }
}
