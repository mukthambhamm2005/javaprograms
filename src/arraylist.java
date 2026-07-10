import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args){
        ArrayList<String>fruits=new ArrayList<String>();

        fruits.add("mango");
        fruits.add("apple");
        fruits.add("cherry");
        System.out.println("fruits "+fruits);

        fruits.add("banana");
        fruits.add("apple");
        System.out.println("fruits after add "+fruits);

        fruits.add(2,"orange");
        System.out.println(fruits);

        System.out.println("fruits at index 2 "+fruits.get(2));

        fruits.set(2,"berry");
        System.out.println(fruits);

        fruits.remove(3);
        System.out.println(fruits);

        fruits.remove("apple");
        System.out.println(fruits);

        System.out.println(fruits.size());

        System.out.println(fruits.contains("orange"));
        System.out.println(fruits.contains("mango"));

        System.out.println(fruits.isEmpty());
        fruits.clear();

        System.out.println(fruits);
        System.out.println(fruits.isEmpty());


    }
}
