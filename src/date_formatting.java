import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class date_formatting {
    public static void main(String[] args){
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        LocalDateTime dateTime=LocalDateTime.now();

        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Date :"+date);
        System.out.println("Time :"+time);
        System.out.println("Date and time :"+dateTime);
        System.out.println("Formatted Date and time :"+dateTime.format(f));
    }

}
