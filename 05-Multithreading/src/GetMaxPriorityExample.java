public class GetMaxPriorityExample {
    // main method
    public static void main(String argvs[]) throws SecurityException, InterruptedException {
        // creating the thread group
        ThreadGroup tg = new ThreadGroup("the parent group");

        ThreadGroup tg1 = new ThreadGroup(tg, "the child group");

        ThreadNew th1 = new ThreadNew("the first", tg);
        System.out.println("Starting the first");

        ThreadNew th2 = new ThreadNew("the second", tg);
        System.out.println("Starting the second");

        int priority = tg.getMaxPriority();

        System.out.println("The maximum priority of the parent ThreadGroup: " + priority);

    }

}
