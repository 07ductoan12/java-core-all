import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("./a.txt");
            FileInputStream fin2 = new FileInputStream("./b.txt");
            FileInputStream fin3 = new FileInputStream("./c.txt");
            FileInputStream fin4 = new FileInputStream("./d.txt");
            Vector v = new Vector<FileInputStream>();
            v.add(fin);
            v.add(fin2);
            v.add(fin3);
            v.add(fin4);
            Enumeration e = v.elements();
            SequenceInputStream bin = new SequenceInputStream(e);
            int i = 0;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }
            bin.close();
            fin.close();
            fin2.close();
            fin3.close();
            fin4.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
}
