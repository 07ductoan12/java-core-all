import java.time.Clock;
import java.time.Duration;

public class JavaClockExample {
    static void exampleTimezone() {
        Clock c = Clock.systemDefaultZone();
        System.out.println(c);
    }

    static void exampleInstant() {
        Clock c = Clock.systemUTC();
        System.out.println(c.instant());
    }

    static void exampleOffset() {
        Clock c = Clock.systemUTC();
        Duration d = Duration.ofHours(5);
        Clock clock = Clock.offset(c, d);
        System.out.println(clock.instant());
    }

    public static void main(String[] args) {
        exampleTimezone();
        exampleInstant();
        exampleOffset();
    }
}
