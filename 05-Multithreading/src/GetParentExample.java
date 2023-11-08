public class GetParentExample {
    public static void main(String argvs[]) throws SecurityException, InterruptedException {
        // creating the thread group
        ThreadGroup tg = new ThreadGroup("the parent group");

        ThreadGroup tg1 = new ThreadGroup(tg, "the child group");

        ThreadNew th1 = new ThreadNew("the first", tg);
        System.out.println("Starting the first");

        ThreadNew th2 = new ThreadNew("the second", tg);
        System.out.println("Starting the second");

        // printing the parent ThreadGroup
        // of both child and parent threads
        System.out.println("The ParentThreadGroup for " + tg.getName() + " is " + tg.getParent().getName());
        System.out.println("The ParentThreadGroup for " + tg1.getName() + " is " + tg1.getParent().getName());

    }
}
