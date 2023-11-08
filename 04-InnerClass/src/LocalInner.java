interface Showable {
    void show();

    interface Message {
        void msg();
    }
}

class A {
    interface Message {
        void msg2();
    }
}

public class LocalInner implements Showable.Message, A.Message {
    private int data = 30;// instance variable

    void display() {
        class Local {
            void msg() {
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    void display2() {
        int value = 50;
        class Local {
            void msg() {
                System.out.println(value);
            }
        }
        Local l = new Local();
        l.msg();
    }

    static int data2 = 30;

    static class Inner {
        /*
         * A static class is a class that is created inside a class, is called a static
         * nested class in Java. It cannot access non-static data members and methods.
         * It can be accessed by outer class name.
         * 
         * It can access static data members of the outer class, including private.
         * The static nested class cannot access non-static (instance) data members or
         */
        void msg() {
            System.out.println("data is" + data2);
        }
    }

    public void msg() {
        System.out.println("Hello nested interface");
    }

    public void msg2() {
        System.out.println("Hello nested interface 2");
    }

    public static void main(String[] args) {
        LocalInner obj = new LocalInner();
        obj.display();
        obj.display2();
        obj.msg();
        obj.msg2();
    }

}
