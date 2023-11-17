import java.sql.Date;

public class JavaSqlDate {
    static void example1() {
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        System.out.println(date);
    }

    static void stringToSQLDateExample() {
        String str = "2023-11-17";
        Date date = Date.valueOf(str);// converting string into sql date
        System.out.println(date);
    }

    public static void main(String[] args) {
        example1();
        stringToSQLDateExample();
    }
}
