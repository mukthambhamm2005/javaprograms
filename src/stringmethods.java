public class stringmethods {
    public static void main(String[] args) {
        String name="John";
        System.out.println("original string : "+name);
        System.out.println("lenght : "+name.length());
        System.out.println("uppercase : "+name.toUpperCase());
        System.out.println("lowercase : "+name.toLowerCase());
        String sname="John";
        System.out.println("compares using equals : "+name.equals(sname));
        System.out.println("compare using equals ignore case : "+name.equalsIgnoreCase(sname));
        System.out.println("chat at : "+name.charAt(0));
        System.out.println("contains oh : "+name.contains("oh"));
        System.out.println("substring from 1 to 3 : "+name.substring(1));
        System.out.println(name==sname);
        String ssname=new String("John");
        System.out.println(name==ssname);
        System.out.println(name.equals(ssname));
    }
}
