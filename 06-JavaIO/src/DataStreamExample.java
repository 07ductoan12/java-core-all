import java.io.FileInputStream;

public class DataStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("./testout2.txt");
            int i = fin.read();
            System.out.println((char) i);
            fin.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        // read all character
        try {
            FileInputStream fin = new FileInputStream("./testout2.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
