abstract class Person {
    /*
     * Java anonymous inner class is an inner class without a name and for which
     * only a single object is created. An anonymous inner class can be useful when
     * making an instance of an object with certain "extras" such as overloading
     * methods of a class or interface, without having to actually subclass a class.
     */

    /*
     * Java Anonymous inner class can be created in two ways:
     * 
     * Class (may be abstract or concrete).
     * Interface
     */
    abstract void eat();
}

public class TestMemberOuter {
    private int data = 30;

    class Inner {
        void msg() {
            System.out.println("data is " + data);
        }
    }

    static void AnonymousInnerExample() {
        Person p = new Person() {
            void eat() {
                System.out.println("nice fruits");
            }
        };
        p.eat();
    }

    public static void main(String args[]) {
        TestMemberOuter obj = new TestMemberOuter();
        TestMemberOuter.Inner in = obj.new Inner();
        in.msg();
        AnonymousInnerExample();
    }
}
