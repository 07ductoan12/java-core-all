public class DeadlockSolved {
    private class resource1 {
        private int i = 10;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }

    private class resource2 {
        private int i = 20;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }

    public static void main(String[] args) {
        DeadlockSolved test = new DeadlockSolved();

        final resource1 a = test.new resource1();
        final resource2 b = test.new resource2();

        // Thread 1
        Runnable b1 = new Runnable() {
            public void run() {
                synchronized (b) {
                    try {
                        /* Adding delay so that both threads can start trying to lock resources */
                        Thread.sleep(400);
                    } catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                    }
                }

                synchronized (a) {
                    System.out.println("In block 1");
                }
            }
        };

        Runnable b2 = new Runnable() {
            public void run() {
                synchronized (b) {
                    // Thread-2 have resource2 but need resource1 also
                    synchronized (a) {
                        System.out.println("In block 2");
                    }
                }
            }
        };

        new Thread(b1).start();
        new Thread(b2).start();
    }
}
