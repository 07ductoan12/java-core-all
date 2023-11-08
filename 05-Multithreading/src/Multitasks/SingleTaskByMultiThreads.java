package Multitasks;

public class SingleTaskByMultiThreads implements Runnable {

    @Override
    public void run() {
        System.out.println("task one");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new SingleTaskByMultiThreads()); // passing annonymous object of SingleTaskByMultiThreads
                                                                // class
        Thread t2 = new Thread(new SingleTaskByMultiThreads());
        t1.start();
        t2.start();
    }
}
