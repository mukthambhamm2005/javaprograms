import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import javax.swing.text.DateFormatter;
public class time_between {
    public static void main(String[] args){
        LocalDate today=LocalDate.now();
        LocalDate start=LocalDate.of(2026,7,11);
        LocalDate end=LocalDate.of(2026,9,3);

        long daysBetween=ChronoUnit.DAYS.between(start,end);
        System.out.println("days between :" +daysBetween);
    }

}
