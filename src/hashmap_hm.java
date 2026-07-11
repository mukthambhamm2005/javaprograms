import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class hashmap_hm {
    public static void main(String[] args){
        Map<Integer,String> em=new HashMap<>();
        em.put(234,"ram");
        em.put(235,"abhiram");
        em.put(236,"rachitha");
        em.put(237,"ramya");
        em.put(238,"raman");
        System.out.println(em);

        Iterator<Map.Entry<Integer,String>> ename=em.entrySet().iterator();
        while(ename.hasNext()){
            Map.Entry<Integer,String> entry =ename.next();
            System.out.println(entry.getKey() +"  :  " + entry.getValue());
        }

    }


}
