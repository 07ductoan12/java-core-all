class Sender {
    public void SenderMgs(String msg) {
        System.out.println(msg);
        try {
            Thread.sleep(800);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Thread interrupted");
        }
        System.out.println("\n" + msg + "Sent");
    }
}

// A Sender class for sending a message using Threads
class SenderWThreads extends Thread {
    private String msg;
    Sender sd;

    SenderWThreads(String m, Sender obj) {
        this.msg = m;
        this.sd = obj;
    }

    public void run() {
        // Checks that only one thread sends a message at a time.
        synchronized (sd) {
            // synchronizing the sender object
            sd.SenderMgs(msg);
        }
    }

}

public class TestSynchronizedBlock2 {
    public static void main(String[] args) {
        Sender sender = new Sender();
        SenderWThreads sender1 = new SenderWThreads("Hola", sender);
        SenderWThreads sender2 = new SenderWThreads("Welcome to Javatpoint website", sender);
        // Start two threads of SenderWThreads type
        sender1.start();
        sender2.start();
        // wait for threads to end
        try {
            sender1.join();
            sender2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
