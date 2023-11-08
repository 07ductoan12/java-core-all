class Operation {
    int data = 50;

    void change(int data) {
        data = data + 100;// changes will be in the local variable only
    }
}

class Operation2 {
    int data = 50;

    void change(Operation2 op) {
        op.data = op.data + 100;// changes will be in the instance variable
    }
}

public class TestCall {
    public static void main(String args[]) {
        Operation op = new Operation();

        System.out.println("before change " + op.data);
        op.change(500);
        System.out.println("after change " + op.data);
        Operation2 op2 = new Operation2();

        System.out.println("before change " + op2.data);
        op2.change(op2);// passing object
        System.out.println("after change " + op2.data);
    }
}
