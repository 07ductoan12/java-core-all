public class IsDaemonExample {
    // main method
    public static void main(String argvs[]) throws SecurityException, InterruptedException {
        // creating the thread group
        /*
         * ThreadGroup methods like stop, destroy, isDestroyed, setDaemon and isDaemon
         * methods are deprecated and will be removed in future release. These
         * API/mechanism to destroy a threadgroup is flawed and such method which
         * supports explicitly or automatically destroying a thread group are terminally
         * deprecated.
         */
        ThreadGroup tg = new ThreadGroup("the parent group");

        ThreadGroup tg1 = new ThreadGroup(tg, "the child group");

        ThreadNew th1 = new ThreadNew("the first", tg);
        System.out.println("Starting the first");

        ThreadNew th2 = new ThreadNew("the second", tg);
        System.out.println("Starting the second");

        if (tg.isDaemon() == true) {
            System.out.println("The group is a daemon group.");
        } else {
            System.out.println("The group is not a daemon group.");
        }

    }
}
