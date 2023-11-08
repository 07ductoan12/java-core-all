public class WrapperExample1 {
    public static void main(String args[]) {
        // Autoboxing
        // Converting int into Integer
        // The automatic conversion of primitive data type into its corresponding
        // wrapper class is known as autoboxing
        int a = 20;
        Integer i = Integer.valueOf(a);// converting int into Integer explicitly
        Integer j = a;// autoboxing, now compiler will write Integer.valueOf(a) internally

        System.out.println(a + " " + i + " " + j);

        // Unboxing
        // The automatic conversion of wrapper type into its corresponding primitive
        // type is known as unboxing.
        // Converting Integer to int
        Integer a2 = new Integer(3);
        int i2 = a2.intValue();// converting Integer to int explicitly
        int j2 = a2;// unboxing, now compiler will write a.intValue() internally
        System.out.println(a + " " + i + " " + j);
    }
}
