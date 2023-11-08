import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;

public class URLDemo {
    static void example1() {
        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File name: " + url.getFile());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    static void example2() {
        try {
            URL url = new URL("https://www.google.com/search?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("Default Port Number: " + url.getDefaultPort());
            System.out.println("Query String: " + url.getQuery());
            System.out.println("Path: " + url.getPath());
            System.out.println("File: " + url.getFile());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void example3() {
        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            java.net.URLConnection urlcon = url.openConnection();
            InputStream stream = urlcon.getInputStream();
            int i;
            while ((i = stream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void example4() {
        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();
            for (int i = 1; i <= 8; i++) {
                System.out.println(huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i));
            }
            huc.disconnect();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void example5() throws UnknownHostException {
        InetAddress ip = Inet4Address.getByName("www.javatpoint.com");
        InetAddress ip1[] = InetAddress.getAllByName("www.javatpoint.com");
        byte addr[] = { 72, 3, 2, 12 };
        System.out.println("ip : " + ip);
        System.out.print("\nip1 : " + ip1);
        InetAddress ip2 = InetAddress.getByAddress(addr);
        System.out.print("\nip2 : " + ip2);
        System.out.print("\nAddress : " + Arrays.toString(ip.getAddress()));
        System.out.print("\nHost Address : " + ip.getHostAddress());
        System.out.print("\nisAnyLocalAddress : " + ip.isAnyLocalAddress());
        System.out.print("\nisLinkLocalAddress : " + ip.isLinkLocalAddress());
        System.out.print("\nisLoopbackAddress : " + ip.isLoopbackAddress());
        System.out.print("\nisMCGlobal : " + ip.isMCGlobal());
        System.out.print("\nisMCLinkLocal : " + ip.isMCLinkLocal());
        System.out.print("\nisMCNodeLocal : " + ip.isMCNodeLocal());
        System.out.print("\nisMCOrgLocal : " + ip.isMCOrgLocal());
        System.out.print("\nisMCSiteLocal : " + ip.isMCSiteLocal());
        System.out.print("\nisMulticastAddress : " + ip.isMulticastAddress());
        System.out.print("\nisSiteLocalAddress : " + ip.isSiteLocalAddress());
        System.out.print("\nhashCode : " + ip.hashCode());
        System.out.print("\n Is ip1 == ip2 : " + ip.equals(ip2));
    }

    public static void main(String[] args) throws UnknownHostException {
        example1();
        System.out.println("---------------------------");
        example2();
        System.out.println("---------------------------");
        example3();
        System.out.println("---------------------------");
        example4();
        System.out.println("---------------------------");
        example5();
    }

}
