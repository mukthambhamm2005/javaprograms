import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class reading_a_file{
    public static void main(String[] args)throws IOException {
        File file = new File("java.txt");
        if (file.createNewFile()) {
            System.out.println("File created");
        } else
            System.out.println("file already exists");

        //Scanner sc=new Scanner(file);
        //while(sc.hasNextLine()){
        //    System.out.println(sc.nextLine());

        if(file.delete()){
            System.out.println("File Deleted Successfully");

        }
        else
            System.out.println("Failed to Delete");
        }
    }