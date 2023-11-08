class Table2 {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
                ;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
        }
    }
}

class MyThreadTest1 extends Thread {
    Table2 t;

    MyThreadTest1(Table2 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThreadTest2 extends Thread {
    Table2 t;

    MyThreadTest2(Table2 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class TestSynchronization2 {
    public static void main(String[] args) {
        Table2 obj = new Table2();
        MyThreadTest1 t1 = new MyThreadTest1(obj);
        MyThreadTest2 t2 = new MyThreadTest2(obj);
        t1.start();
        t2.start();
    }
}
