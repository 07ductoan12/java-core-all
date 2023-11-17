import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTimeLearn {
    static void example1() {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalTime time2 = LocalTime.of(15, 44, 20, 0);
        System.out.println(time2);
    }

    // minusHours - minusMinutes
    static void example2() {
        LocalTime time1 = LocalTime.of(15, 45, 12);
        System.out.println(time1);
        LocalTime time2 = time1.minusHours(2);
        LocalTime time3 = time2.minusMinutes(34);
        System.out.println(time3);
    }

    static void timeZone() {
        ZoneId zone1 = ZoneId.of("Asia/Ho_Chi_Minh");
        ZoneId zone2 = ZoneId.of("Asia/Tokyo");
        LocalTime time1 = LocalTime.now(zone1);
        System.out.println("VietNam Time Zone: " + time1);
        LocalTime time2 = LocalTime.now(zone2);
        System.out.println("Japan Time Zone: " + time2);
        long hours = ChronoUnit.HOURS.between(time1, time2);
        System.out.println("Hours between two Time Zone: " + hours);
        long minutes = ChronoUnit.MINUTES.between(time1, time2);
        System.out.println("Minutes between two time zone: " + minutes);
    }

    public static void main(String[] args) {
        example1();
        example2();
        timeZone();
    }

}
