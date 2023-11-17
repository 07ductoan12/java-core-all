import java.util.Date;

public class JavaUtilDate {
    static void example1st() {
        Date date = new Date();
        System.out.println(date);
    }

    static void example2nd() {
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        System.out.println(date);
    }

    public static void main(String[] args) {
        example1st();
        example2nd();
    }
}
