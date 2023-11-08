import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutput_InputStreamExample {
    /*
     * Java BufferedOutputStream class is used for buffering an output stream. It
     * internally uses buffer to store data. It adds more efficiency than to write
     * data directly into a stream. So, it makes the performance fast.
     */
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("./testout2.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Welcome to Java";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success...");

        System.out.println("------------------------)");

        FileInputStream fin = new FileInputStream("./testout2.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        int i;
        while ((i = bin.read()) != -1) {
            System.out.print((char) i);
        }
        bin.close();
        fin.close();
    }
}
