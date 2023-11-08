public class RemoveHookExample {
    static class Msg extends Thread {
        public void run() {
            System.out.println("Bye ...");
        }
    }

    public static void main(String[] args) {
        try {
            Msg ms = new Msg();
            Runtime.getRuntime().addShutdownHook(ms);
            System.out.println("The program is beginning ...");
            System.out.println("Waiting for 2 second");
            Thread.sleep(2000);
            System.out.println("The program is terminating ...");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
