import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashmap {
    public static void main(String[] args){
        Map<Integer,String> name =new LinkedHashMap<>();
        name.put(1,"johnny");
        name.put(2,"ram");
        name.put(3,"meera");
        name.put(4,"maddy");
        System.out.println(name);
    }

}
