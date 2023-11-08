import java.io.FileOutputStream;

public class FileOutputStreamExample {
    /*
     * Java FileOutputStream is an output stream used for writing data to a file.
     * 
     * If you have to write primitive values into a file, use FileOutputStream
     * class. You can write byte-oriented as well as character-oriented data through
     * FileOutputStream class. But, for character-oriented data, it is preferred to
     * use FileWriter than FileOutputStream.
     */
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("./testout1.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        try {
            FileOutputStream fout = new FileOutputStream("./testout2.txt");
            String s = "Welcome to Java";
            byte b[] = s.getBytes(); // converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
