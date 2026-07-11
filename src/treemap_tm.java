import java.util.Map;
import java.util.TreeMap;

public class treemap_tm {
    public static void main(String[] args){
        Map<Integer,String> tm=new TreeMap<>();
        tm.put(20,"australia");
        tm.put(91,"India");
        tm.put(101,"america");
        tm.put(95,"russia");
        tm.put(856,"ukrain");
        System.out.println(tm);

    }
}
