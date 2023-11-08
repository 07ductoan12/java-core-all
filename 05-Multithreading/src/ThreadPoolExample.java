import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tasks implements Runnable {
    private String taskName;

    public Tasks(String str) {
        this.taskName = str;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            for (int i = 0; i <= 5; i++) {
                if (i == 0) {
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
                    // prints the initialization time for every task
                    System.out.println("Initialization time for the task name: " + taskName + " = " + sdf.format(dt));
                } else {
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat();
                    System.out.println("Time of execution for the task name: " + taskName + " = " + sdf.format(dt));
                }
                Thread.sleep(1000);
            }
            System.out.println(taskName + " is complete.");
        } catch (InterruptedException ie) {
            // TODO: handle exception
            ie.printStackTrace();
        }
    }

}

public class ThreadPoolExample {
    static final int MAX_TH = 3;

    public static void main(String[] args) {
        // Creating five new tasks
        Runnable rb1 = new Tasks("task 1");
        Runnable rb2 = new Tasks("task 2");
        Runnable rb3 = new Tasks("task 3");
        Runnable rb4 = new Tasks("task 4");
        Runnable rb5 = new Tasks("task 5");

        // creating a thread pool with MAX_TH number of
        // threads size the pool size is fixed
        ExecutorService pl = Executors.newFixedThreadPool(MAX_TH);

        // passes the Task objects to the pool to execute (Step 3)
        pl.execute(rb1);
        pl.execute(rb2);
        pl.execute(rb3);
        pl.execute(rb4);
        pl.execute(rb5);

        // pool is shutdown
        pl.shutdown();
    }
}
