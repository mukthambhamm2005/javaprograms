import java.util.HashMap;
public class hashmap_class {
    public static void main(String[] args){
        HashMap <Integer,String> hs =new HashMap<>();
        hs.put(1,"A");
        hs.put(2,"B");
        hs.put(3,"C");
        hs.put(4,"D");
        hs.put(5,"E");
        System.out.println(hs);
        System.out.println(hs.containsKey(3));
        hs.remove(2,"B");
        System.out.println(hs);
    }
}
