public class WorkerThread implements Runnable {
    private String message;

    public WorkerThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(Thread.currentThread().getName() + "(Start) message = + " + this.message);
        progressmessage();
        System.out.println(Thread.currentThread().getName() + "(End)");
    }

    private void progressmessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            // TODO: handle exception
            ie.printStackTrace();
        }
    }

}
