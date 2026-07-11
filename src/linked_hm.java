import java.util.LinkedHashMap;
import java.util.Map;
public class linked_hm {
    public static void main(String[] args){
        Map <Integer,String> product=new LinkedHashMap<>();
        product.put(101,"food");
        product.put(102,"cloth");
        product.put(103,"electric");
        product.put(104,"footwear");
        product.put(105,"books");
        System.out.println(product);
        product.replace(103,"box");
        System.out.println(product);

    }
}
