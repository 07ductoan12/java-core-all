public class ActiveGroupCountExample {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("The parent group of threads");

        ThreadGroup tg1 = new ThreadGroup(tg, "the child group");

        ThreadNew th1 = new ThreadNew("the first", tg);
        System.out.println("Starting the first");

        ThreadNew th2 = new ThreadNew("The second", tg);
        System.out.println("Starting the second");
        System.out.println("The total number of active thread groups are: " + tg.activeGroupCount());
    }
}
