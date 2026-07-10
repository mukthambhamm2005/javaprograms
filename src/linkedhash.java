import java.util.Set;
import java.util.LinkedHashSet;

public class linkedhash {
    public static void main(String[] args){
        Set<String> animals=new LinkedHashSet<>();
        animals.add("monkey");
        animals.add("donkey");
        animals.add("elephant");
        animals.add("monkey");
        System.out.println("animal names  :" + animals);
    }
}
