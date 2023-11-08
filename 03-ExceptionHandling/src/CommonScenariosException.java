public class CommonScenariosException {
    static void commonException() {
        int a = 50 / 0; // ArithmeticException

        String s = null;
        System.out.println(s.length()); // NullPointerException

        s = "abc";
        int i = Integer.parseInt(s); // NumberFormatException

        int a1[] = new int[5];
        a1[10] = 50; // ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        System.out.println("...");
    }

}
