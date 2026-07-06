public class testImmutable {
    public static void main(String[] args){
        String s1="hello ";
        System.out.println("original string :"+s1);
        s1.concat("world");
        System.out.println("concatenation without assignment  :"+s1);
        String s2=s1.concat(" world");
        System.out.println("concatenation with assignment  :" +s2);
        System.out.println("string s1   :"+ s1);

        s1=s1.concat(" java");
        System.out.println("string s1   :"+ s1);
        s1=s1.concat(" world");
        System.out.println("string s1   :"+ s1);
        s1=s1.concat(" java");
        System.out.println("string s1   :"+ s1);
    }
}
