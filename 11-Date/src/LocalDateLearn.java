import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateLearn {

    static void localDate() {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = yesterday.plusDays(2);
        System.out.println("Today date: " + date);
        System.out.println("Yesterday date: " + yesterday);
        System.out.println("1. Tomorrow date: " + tomorrow);
        tomorrow = date.plusDays(1);
        System.out.println("2. Tomorrow date: " + tomorrow);
    }

    static void leapYear() {
        LocalDate date1 = LocalDate.of(2016, 12, 7);
        LocalDate date2 = LocalDate.of(2023, 12, 7);
        System.out.println(date1.isLeapYear());
        System.out.println(date2.isLeapYear());
    }

    static void formatDatetime() {
        LocalDate d1 = LocalDate.now();
        String d1Str = d1.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date in String: " + d1Str);
    }

    static void strToDate() {
        String dlnStr = "2023-08-11";
        LocalDate d1 = LocalDate.parse(dlnStr);
        System.out.println("String to LocalDate: " + d1);

    }

    public static void main(String[] args) throws Exception {
        localDate();
        leapYear();
        formatDatetime();
        strToDate();
    }
}
