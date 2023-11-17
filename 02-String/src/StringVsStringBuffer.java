public class StringVsStringBuffer {
    static String concatWithString() {
        String t = "java";
        for (int i = 0; i < 10000; i++) {
            t += "Tpoint";
        }
        return t;
    }

    static String concatWithStringBuffer() {
        StringBuffer sb = new StringBuffer("java");
        for (int i = 0; i < 10000; i++) {
            sb.append("Tpoint");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        // Performance Test of String and StringBuffer
        long startTime = System.currentTimeMillis();
        concatWithString();
        System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println(
                "Time taken by Concating with StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

        // Hashcode test
        System.out.println("Hashcode test of String:");
        String str = "java";
        System.out.println(str.hashCode());
        str = str + "tpoint";
        System.out.println(str.hashCode());

        System.out.println("Hashcode test of StringBuffer:");
        StringBuffer sb = new StringBuffer("java");
        System.out.println(sb.hashCode());
        sb.append("tpoint");
        System.out.println(sb.hashCode());
    }
}
