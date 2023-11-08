class Table4 {
    synchronized static void printTabel(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
        }
    }
}

public class StaticSynchronization {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                Table4.printTabel(1);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                Table4.printTabel(10);
            }
        };
        Thread t3 = new Thread() {
            public void run() {
                Table4.printTabel(100);
            }
        };
        Thread t4 = new Thread() {
            public void run() {
                Table4.printTabel(1000);
            }
        };
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
