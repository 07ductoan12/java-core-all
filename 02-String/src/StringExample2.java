import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringExample2 {
    static void immutableString() {
        String s = "Sachin";
        s.concat(" Tendulkar");// concat() method appends the string at the end
        System.out.println(s);// will print Sachin because strings are immutable objects
        s = s.concat(" Tendulkar"); // s points to the "Sachin Tendulkar"
        System.out.println(s);
    }

    static void stringCompareByEquals() {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");
        String s4 = "Saurav";
        System.out.println(s1.equals(s2));// true
        System.out.println(s1.equals(s3));// true
        System.out.println(s1.equals(s4));// false
    }

    static void stringCompareByOperator() {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");
        System.out.println(s1 == s2);// true (because both refer to same instance)
        System.out.println(s1 == s3);// false(because s3 refers to instance created in nonpool)
    }

    static void stringCompareBycompareTo() {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = "Ratan";
        System.out.println(s1.compareTo(s2));// 0 s1 == s2 : The method returns 0.
        System.out.println(s1.compareTo(s3));// 1(because s1>s3) s1 > s2 : The method returns a positive value.
        System.out.println(s3.compareTo(s1));// -1(because s3 < s1 ) s1 < s2 : The method returns a negative value.
    }

    static void stringConcat() {
        String s = "Sachin" + " Tendulkar";
        /*
         * The Java compiler transforms above code to this:
         * String s=(new StringBuilder()).append("Sachin").append("
         * Tendulkar).toString();
         */
        System.out.println(s);// Sachin Tendulkar
        String s1 = 50 + 30 + "Sachin" + 40 + 40;
        System.out.println(s1);
    }

    static void stringConcatByconcatMethod() {
        String s1 = "Sachin ";
        String s2 = "Tendulkar";
        String s3 = s1.concat(s2);
        System.out.println(s3);// Sachin Tendulkar
    }

    static void stringConcatUsingStringBuilder() {
        StringBuilder s1 = new StringBuilder("Hello"); // String 1
        StringBuilder s2 = new StringBuilder(" World"); // String 2
        StringBuilder s = s1.append(s2); // String 3 to store the result
        System.out.println(s.toString()); // Displays result
    }

    static void stringConcatUsingformat() {
        String s1 = new String("Hello"); // String 1
        String s2 = new String(" World"); // String 2
        String s = String.format("%s%s", s1, s2); // String 3 to store the result
        System.out.println(s.toString()); // Displays result
    }

    static void stringConcatUsingjoin() {
        String s1 = new String("Hello"); // String 1
        String s2 = new String(" World"); // String 2
        String s = String.join("", s1, s2); // String 3 to store the result
        System.out.println(s.toString()); // Displays result
    }

    static void stringConcatUsingStringJoiner() {
        StringJoiner s = new StringJoiner(", "); // StringeJoiner object
        s.add("Hello"); // String 1
        s.add("World"); // String 2
        System.out.println(s.toString()); // Displays result
    }

    static void stringConcatUsingCollectorsJoining() {
        List<String> liststr = Arrays.asList("abc", "pqr", "xyz");
        String str = liststr.stream().collect(Collectors.joining(", "));
        System.out.println(str.toString());
    }

    public static void main(String args[]) {
        immutableString();
        // String compare
        stringCompareByEquals();
        stringCompareByOperator();
        stringCompareBycompareTo();
        // Concatenation
        stringConcat();
        stringConcatByconcatMethod();
        stringConcatUsingStringBuilder();
        stringConcatUsingformat();
        stringConcatUsingjoin();
        stringConcatUsingStringJoiner();
        stringConcatUsingCollectorsJoining();
    }
}
