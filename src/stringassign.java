public class stringassign {
    public static void main(String[] args) {
        String s="Java Programming";
        System.out.println("length  " +s.length());
        System.out.println("uppercase  "+s.toUpperCase());
        System.out.println("lowercase "+s.toLowerCase());
        System.out.println("first character : "+s.charAt(0));
        System.out.println("last character "+s.charAt(15));
        System.out.println("last character : "+s.charAt(s.length()-1));
        String s1="java";
        String s2="JAVA";
        System.out.println("using equals : "+s1.equals(s2));
        System.out.println("using equals ignorecase : "+s1.equalsIgnoreCase(s2));
    }
}
