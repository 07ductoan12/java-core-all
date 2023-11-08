public class operators_in_java {
    public static void unaryOperator() {
        int x = 10;
        System.out.println(x++); // 10 -> 11
        System.out.println(++x); // 11 -> 12
        System.out.println(x--); // 12 -> 11
        System.out.println(--x); // 11 -> 10

        // Example ~ and !
        int a = 10;
        int b = -10;
        boolean c = true;
        boolean d = false;

        System.out.println(~a); // a+1 -> 11
        System.out.println(~b); // b-1 -> -9
        System.out.println(!c); // not true == false
        System.out.println(!d); // not false == true
    }

    public static void arithmeticOperator() {
        int a = 10;
        int b = 5;
        System.out.println(a + b); // add
        System.out.println(a - b); // sub
        System.out.println(a * b); // mul
        System.out.println(a / b); // div
        System.out.println(a % b); // module
        int a2 = 10;
        int b2 = 20;
        a2 += 4;// a=a+4 (a=10+4)
        b2 -= 4;// b=b-4 (b=20-4)
        System.out.println(a2);
        System.out.println(b2);
    }

    public static void shiftOperator() {
        // left shift operator
        System.out.println(10 << 2); // 10*2^2=10*4=40
        System.out.println(10 << 3); // 10*2^3=10*8=80
        System.out.println(15 << 4); // 15*2^4=15*16=240

        // right shift operator
        System.out.println(20 >> 2); // 20/2^2 = 20/4 = 5
        System.out.println(20 >>> 2); // >> same >>>

        System.out.println(-20 >> 2); // 20/2^2 = 20/4 = -5
    }

    public static void logicalOperator() {
        int a = 10;
        int b = 5;
        int c = 20;
        // and operator
        System.out.println(a < b && a < c); // fasle and true == fasle
        System.out.println(a < b & a < c);

        // logical && (and) and Bitwise &
        System.out.println(a < b && a++ < c);// false && true = false
        System.out.println(a);// 10 because second condition is not checked
        System.out.println(a < b & a++ < c);// false && true = false
        System.out.println(a);// 11 because second condition is checked

        // Logical || (or) and Bitwise |
        System.out.println(a > b || a < c);// true || true = true
        System.out.println(a > b | a < c);// true | true = true
        System.out.println(a > b || a++ < c);// true || true = true
        System.out.println(a);// 10 because second condition is not checked
        System.out.println(a > b | a++ < c);// true | true = true
        System.out.println(a);// 11 because second condition is checked
    }

    public static void ternaryOperator() {
        int a = 2;
        int b = 5;
        int min = (a < b) ? a : b;
        System.out.println(min);
    }

    public static void main(String[] args) {
        unaryOperator();
        System.out.println("-----------------------");
        arithmeticOperator();
        System.out.println("-----------------------");
        shiftOperator();
        System.out.println("-----------------------");
        ternaryOperator();
        System.out.println("-----------------------");
    }
}
