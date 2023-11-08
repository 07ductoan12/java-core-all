class TestCallRun extends Thread {
    public void run() {
        System.out.println("running ...");
    }
}

class TestCallRun2 extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}

public class ExampleMethod {
    public static void main(String[] args) {
        TestCallRun t = new TestCallRun();
        t.run(); // fine, but does not start a separate call stack

        TestCallRun2 t1 = new TestCallRun2();
        TestCallRun2 t2 = new TestCallRun2();

        t1.run();
        t2.run();
        // no context-switching because here t1 and t2 will be treated as normal object
        // not thread object.
    }
}
