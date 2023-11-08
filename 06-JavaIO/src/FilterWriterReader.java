import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterReader;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

class CustomFilterWriter extends FilterWriter {
    CustomFilterWriter(Writer out) {
        super(out);
    }

    public void write(String str) throws IOException {
        super.write(str.toLowerCase());
    }

}

class CustomFilterReader extends FilterReader {
    CustomFilterReader(Reader in) {
        super(in);
    }

    public int read() throws IOException {
        int x = super.read();
        if ((char) x == ' ')
            return ((int) '?');
        else
            return x;
    }
}

public class FilterWriterReader {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Record.txt");
            CustomFilterWriter filterWriter = new CustomFilterWriter(fw);
            filterWriter.write("I LOVE MY COUNTRY");
            filterWriter.close();
            FileReader fr = new FileReader("Record.txt");
            BufferedReader bufferedReader = new BufferedReader(fr);
            int k;
            while ((k = bufferedReader.read()) != -1) {
                System.out.print((char) k);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
