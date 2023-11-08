import java.util.Arrays;

public class StringExample3 {
    static void exampleSubString() {
        String s = "SachinTendulkar";
        System.out.println("Original String: " + s);
        System.out.println("Substring starting from index 6: " + s.substring(6));// Tendulkar
        System.out.println("Substring starting from index 0 to 6: " + s.substring(0, 6)); // Sachin
    }

    static void subtringUsingSplit() {
        String text = new String("Hello, My name is Sachin");
        /* Splits the sentence by the delimeter passed as an argument */
        String[] sentences = text.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }

    public static void main(String[] args) {
        exampleSubString();
        subtringUsingSplit();
    }
}
