package Multitasks;

class Simple1 extends Thread {
    public void run() {
        System.out.println("task one");
    }
}

class Simple2 extends Thread {
    public void run() {
        System.out.println("task two");
    }
}

public class MultiTaskByMultiThreads {
    public static void main(String[] args) {
        Simple1 t1 = new Simple1();
        Simple2 t2 = new Simple2();

        t1.start();
        t2.start();

        // Same example as above by anonymous class that extends Thread class
        Thread t3 = new Thread() {
            public void run() {
                System.out.println("task three");
            }
        };

        Thread t4 = new Thread() {
            public void run() {
                System.out.println("task four");
            }
        };

        t3.start();
        t4.start();
    }
}
