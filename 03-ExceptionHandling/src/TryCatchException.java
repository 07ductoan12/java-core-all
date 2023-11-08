import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

class UserDefindedException extends Exception {
    public UserDefindedException(String str) {
        super(str);
    }
}

class M {
    void method() throws IOException {
        throw new IOException("device error");
    }
}

class M1 {
    void method() throws IOException {
        System.out.println("device operation performed");
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        // calling the constructor of parent Exception
        super(str);
    }
}

public class TryCatchException {
    static void tryCatchExample() {
        int i = 50;
        int j = 0;
        int data;
        try {
            data = i / j; // may throw exception
            System.out.println("rest of the code");
        }
        // handing the exception
        catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            System.out.println(i / (j + 2));
        }
        System.out.println("rest of the code 1");
    }

    static void tryCatchExample1() {
        try {
            int arr[] = { 1, 3, 5, 7 };
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

    static void tryCatchExample2() {
        PrintWriter pw;
        try {
            pw = new PrintWriter("jtp.txt");
            pw.println("saved");
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println(e);
        }
        System.out.println("Filed saved successfully");
    }

    static void multipleTryCatch() {
        try {
            int a[] = new int[5];

            System.out.println(a[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }

    static void nestedTryBlock() {
        // outer (main) try block
        try {

            // inner try block 1
            try {

                // inner try block 2
                try {
                    int arr[] = { 1, 2, 3, 4 };

                    // printing the array element out of its bounds
                    System.out.println(arr[10]);
                }

                // to handles ArithmeticException
                catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception");
                    System.out.println(" inner try block 2");
                }
            }

            // to handle ArithmeticException
            catch (ArithmeticException e) {
                System.out.println("Arithmetic exception");
                System.out.println("inner try block 1");
            }
        }

        // to handle ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e4) {
            System.out.print(e4);
            System.out.println(" outer (main) try block");
        } catch (Exception e5) {
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
    }

    static void finallyBlockExample() {
        try {

            System.out.println("Inside try block");

            // below code throws divide by zero exception
            int data = 25 / 0;
            System.out.println(data);
        }

        // handles the Arithmetic Exception / Divide by zero exception
        catch (ArithmeticException e) {
            System.out.println("Exception handled");
            System.out.println(e);
        }

        // executes regardless of exception occured or not
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of the code...");
    }

    public static void method() throws FileNotFoundException {
        // The Java throws keyword is used to declare an exception. It gives an
        // information to the programmer that there may occur an exception
        FileReader file = new FileReader("./jpt.txt");
        BufferedReader fileInput = new BufferedReader(file);

        throw new FileNotFoundException();
    }

    static void handingExceptionUsingTryCatch() {
        try {
            M m = new M();
            m.method();
        } catch (Exception e) {
            System.out.println("exception handled");
        }

        System.out.println("normal flow...");
    }

    static void decalreExceptiona() throws IOException {
        M m = new M();
        m.method();
        System.out.println("normal flow");
    }

    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {

            // throw an object of user defined exception
            throw new InvalidAgeException("age is not valid to vote");
        } else {
            System.out.println("welcome to vote");
        }
    }

    static void example1() {
        try {
            method();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("rest of the code");
    }

    static void example2() {
        try {
            throw new UserDefindedException("This is user-defined exception");
        } catch (UserDefindedException ude) {
            // TODO: handle exception
            System.out.println("Caught the exception");
            System.out.println(ude.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        tryCatchExample();
        tryCatchExample1();
        tryCatchExample2();
        multipleTryCatch();
        nestedTryBlock();
        finallyBlockExample();

        handingExceptionUsingTryCatch();
        decalreExceptiona();

        try {
            // calling the method
            validate(13);
        } catch (InvalidAgeException ex) {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + ex);
        }

        System.out.println("rest of the code...");
    }
}
