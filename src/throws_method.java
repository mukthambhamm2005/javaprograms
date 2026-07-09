import java.io.FileNotFoundException;
import java.io.FileReader;
public class throws_method {
    static void readFile() throws FileNotFoundException {
        FileReader fr=new FileReader("data.txt");
    }
    public static void main(String[] args){
        System.out.println("first statement");
        try{
            readFile();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("last statement");
    }
}
