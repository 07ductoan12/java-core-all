class Multi extends Thread {
    // Java Thread Example by extending Thread class
    public void run() {
        System.out.println("thread is running ...");
    }
}

class Multi3 implements Runnable {
    // Java Thread Example by implementing Runnable interface

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("thread is running ...");
    }

}

public class CreateThread {
    public static void main(String[] args) {
        Multi t1 = new Multi();
        t1.start();

        Multi3 m3 = new Multi3();
        Thread t2 = new Thread(m3);
        t2.start();

        Thread t = new Thread("My first thread");
        t.start();
        String str = t.getName();
        System.out.println(str);

        Multi3 m4 = new Multi3();
        Thread th1 = new Thread(m4, "My new thread");

        th1.start();
        System.out.println(th1.getName());
    }
}