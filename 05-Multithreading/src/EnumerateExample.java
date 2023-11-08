public class EnumerateExample {
    public static void main(String[] args) throws SecurityException, InterruptedException {
        // creating the thread group
        ThreadGroup tg = new ThreadGroup("the parent group");

        ThreadGroup tg1 = new ThreadGroup(tg, "the child group");

        ThreadNew th1 = new ThreadNew("the first", tg);
        System.out.println("Starting the first");

        ThreadNew th2 = new ThreadNew("the second", tg);
        System.out.println("Starting the second");
        Thread[] grp = new Thread[tg.activeCount()];
        int cnt = tg.enumerate(grp);
        for (int i = 0; i < cnt; i++) {
            System.out.println("Thread " + grp[i].getName() + " is found.");
        }
    }
}
