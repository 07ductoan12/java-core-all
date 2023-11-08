import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.PushbackInputStream;
import java.io.PushbackReader;

public class InputStreamExample {

    static void PushbackInputStreamExample() throws Exception {
        /*
         * Java PushbackInputStream class overrides InputStream and provides extra
         * functionality to another input stream. It can unread a byte which is already
         * read and push back one byte.
         */
        String srg = "1##2##34###12";
        byte ary[] = srg.getBytes();
        ByteArrayInputStream array = new ByteArrayInputStream(ary);
        PushbackInputStream push = new PushbackInputStream(array);

        int i;
        while ((i = push.read()) != -1) {
            if (i == '#') {
                int j;
                if ((j = push.read()) == '#') {
                    System.out.print("**");
                } else {
                    push.unread(j);
                    System.out.print((char) i);
                }
            } else {
                System.out.print((char) i);
            }
        }
    }

    static void PushbackReaderExample() throws Exception {
        /*
         * Java PushbackReader class is a character stream reader. It is used to pushes
         * back a character into stream and overrides the FilterReader class.
         */
        char ary[] = { '1', '-', '-', '2', '-', '3', '4', '-', '-', '-', '5', '6' };
        CharArrayReader reader = new CharArrayReader(ary);
        PushbackReader push = new PushbackReader(reader);
        int i;
        while ((i = push.read()) != -1) {
            if (i == '-') {
                int j;
                if ((j = push.read()) == '-') {
                    System.out.print("#*");
                } else {
                    push.unread(j); // push back single character
                    System.out.print((char) i);
                }
            } else {
                System.out.print((char) i);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        PushbackInputStreamExample();
        System.out.println();
        PushbackReaderExample();
    }
}
