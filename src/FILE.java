import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import javax.swing.text.DateFormatter;
import java.io.File;
public class FILE {
    public static void main(String[] args)throws IOException {
        File file = new File("java.txt");
        if (file.createNewFile()) {
            System.out.println("File created");
        } else
            System.out.println("file already exists");
        FileWriter fw = new FileWriter("java.txt");
        fw.write("we are learning file handling in java \n how are you?");
        fw.close();
        System.out.println("File writing completed");
    }
}
