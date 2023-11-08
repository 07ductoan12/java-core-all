// java doc tags
/**
 * <h2>Learn Java</h2>
 * Lean java in JavaPoint
 * <p>
 * <b>Note:</b> Comments make the code readable and
 * easy to understand.
 * 
 * @author toan
 * @version 1.0
 * @since 2023-08-20
 */

public class Loop {
    public static void forExample() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void nestedForLoop() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    public static void pyramidExample() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pyramidExample2() {
        int temp = 6;
        for (int i = 1; i <= temp; i++) {
            for (int j = temp; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void forEachExample() {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void labeledForExample() {
        aa: for (int i = 1; i <= 3; i++) {
            bb: for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa; // break statement loop
                }
                System.out.println(i + " " + j);
            }
        }
    }

    public static void whileLoop() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void dowhileExample() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void continueStagement() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static int sum(int input1, int input2) {
        /**
         * This method calculates the summation of two integers.
         * 
         * @param input1 This is the first parameter to sum() method
         * @param input2 This is the second parameter to the sum() method.
         * @return int This returns the addition of input1 and input2
         */
        return input1 + input2;
    }

    public static void main(String[] args) {

        forExample();
        System.out.println("---------------");
        nestedForLoop();
        System.out.println("---------------");
        pyramidExample();
        System.out.println("---------------");
        pyramidExample2();
        System.out.println("---------------");
        forEachExample();
        System.out.println("---------------");
        labeledForExample();
        System.out.println("---------------");
        whileLoop();
        System.out.println("---------------");
        dowhileExample();
        System.out.println("---------------");
        continueStagement();
        /*
         * Let's declare and
         * print variable in java.
         */
        /*
         * float j = 5.9;
         * float k = 4.4;
         * System.out.println( j + k );
         */
        System.out.println("---------------");
        System.out.println(sum(3, 3));
    }
}
