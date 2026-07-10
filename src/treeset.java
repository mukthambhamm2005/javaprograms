import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class treeset {
    public static void main(String[] args){
        Set<Integer> age=new TreeSet<>();
        age.add(10);
        age.add(80);
        age.add(50);
        age.add(70);
        age.add(20);
        age.add(90);
        System.out.println(age);
    }
}
