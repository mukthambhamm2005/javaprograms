import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import javax.swing.text.DateFormatter;

public class date_formatting {
    public static void main(String[] args){
        LocalDate date=LocalDate.now();
        LocalDate today=LocalDate.now();
        LocalDate nextWeek=today.plusWeeks(1);
        LocalDate lastWeek=today.minusWeeks(1);
        LocalDate nextMonth=today.plusMonths(1);
        LocalDate nextYear=today.plusYears(1);

        LocalTime time=LocalTime.now();
        LocalDateTime dateTime=LocalDateTime.now();


        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd(EEEE)-MMMM-yyyy ");

        System.out.println("Date :"+date);
        System.out.println("Time :"+time);
        System.out.println("Date and time :"+dateTime);
        System.out.println("Formatted Date and time :"+dateTime.format(f));
        System.out.println("next week Date  :"+nextWeek.format(f));
        System.out.println("last week Date  :"+lastWeek.format(f));
        System.out.println("next month  :"+nextMonth.format(f));
        System.out.println("next year  :"+nextYear.format(f));

    }

}
