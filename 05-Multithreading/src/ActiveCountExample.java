class ThreadNew extends Thread {
    ThreadNew(String tName, ThreadGroup tgrp) {
        super(tgrp, tName);
        start();
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(5);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("The exception has been encounted " + e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " thread has finished executing");
    }
}

public class ActiveCountExample {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("The parent group of threads");

        ThreadNew th1 = new ThreadNew("first", tg);
        System.out.println("Start the first");

        ThreadNew th2 = new ThreadNew("first", tg);
        System.out.println("Start the second");

        System.out.println("The total number of active threads are: " + tg.activeCount());
    }
}
