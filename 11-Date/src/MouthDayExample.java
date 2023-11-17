
/**
 * MouthDay
 */
import java.time.*;
import java.time.temporal.*;

public class MouthDayExample {

    static void isValidYearExample() {
        MonthDay month = MonthDay.now();
        boolean b = month.isValidYear(2000);
        System.out.println(b);
    }

    static void exampleGet() {
        MonthDay month = MonthDay.now();
        long n = month.get(ChronoField.MONTH_OF_YEAR);
        System.err.println(n);
    }

    static void exampleRange() {
        MonthDay month = MonthDay.now();
        ValueRange r1 = month.range(ChronoField.MONTH_OF_YEAR);
        System.out.println(r1);
        ValueRange r2 = month.range(ChronoField.DAY_OF_MONTH);
        System.out.println(r2);
    }

    public static void main(String[] args) {
        MonthDay month = MonthDay.now();
        LocalDate date = month.atYear(2000);
        System.out.println(date);

        isValidYearExample();
        exampleGet();
        exampleRange();
    }
}