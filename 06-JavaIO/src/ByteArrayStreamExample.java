import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayStreamExample {
    /*
     * Java ByteArrayOutputStream class is used to write common data into multiple
     * files. In this stream, the data is written into a byte array which can be
     * written to multiple streams later.
     * The ByteArrayOutputStream holds a copy of data and forwards it to multiple
     * streams.
     * The buffer of ByteArrayOutputStream automatically grows according to data.
     */

    static void ByteArrayOutputStreamExample() {
        try {
            FileOutputStream fout1 = new FileOutputStream("./f1.txt");
            FileOutputStream fout2 = new FileOutputStream("./f2.txt");

            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            bout.write(65);
            bout.writeTo(fout1);
            bout.writeTo(fout2);
            bout.flush();
            bout.close();
            System.out.println("Success...");
        } catch (IOException io) {
            // TODO: handle exception
            io.printStackTrace();
        }
    }

    static void ByteArrayInputStreamExample() throws IOException {
        byte[] buf = { 35, 36, 37, 38 };
        // Create the new byte array input stream
        ByteArrayInputStream byt = new ByteArrayInputStream(buf);
        int k = 0;
        while ((k = byt.read()) != -1) {
            // Conversion of a byte into character
            char ch = (char) k;
            System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);
        }
    }

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStreamExample();
        ByteArrayInputStreamExample();
    }
}
