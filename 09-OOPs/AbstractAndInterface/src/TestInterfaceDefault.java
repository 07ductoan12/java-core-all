interface Drawable1 {
    void draw();

    default void msg() {
        // we can have method body in interface. But we need to make it default method.
        System.out.println("default method");
    }
}

class Rectangle1 implements Drawable1 {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

public class TestInterfaceDefault {
    public static void main(String args[]) {
        Drawable1 d = new Rectangle1();
        d.draw();
        d.msg();
    }
}
