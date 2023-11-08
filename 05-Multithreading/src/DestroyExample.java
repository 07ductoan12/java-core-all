public class DestroyExample {
    public static void main(String[] args) throws SecurityException, InterruptedException {
        ThreadGroup tg = new ThreadGroup("the parent group");
        ThreadGroup tg1 = new ThreadGroup(tg, "the child group");

        ThreadNew th1 = new ThreadNew("the first", tg);
        System.out.println("Start the first");

        ThreadNew th2 = new ThreadNew("the second", tg);
        System.out.println("Start the second");

        th1.join();
        th2.join();

        // destroying the child thread group
        tg1.interrupt();
        System.out.println(tg1.getName() + " is destroyed.");
        // destroying the parent thread group
        tg.interrupt();
        System.out.println(tg.getName() + " is destroyed.");
    }
}
