
class Adder {
    // Method Overloading: changing no. of arguments
    static int add(int a, int b) {
        /*
         * @params: a first parameter type integer
         * 
         * @params: b second parameter type integer
         * 
         * @return: addition of a and b type integer
         */
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Adder2 {
    // Method Overloading: changing data type of arguments
    static int add(int a, int b) {
        /*
         * @params: a first parameter type integer
         * 
         * @params: b second parameter type integer
         * 
         * @params: c third parameter type integer
         * 
         * @return: addition of a,b and c type integer
         */
        return a + b;
    }

    static double add(double a, double b) {
        /*
         * @params: a first parameter type double
         * 
         * @params: b second parameter type double
         * 
         * @return: addition of a and b type double
         */
        return a + b;
    }
}

class OverloadingCalculation1 {
    void sum(int a, long b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

class OverloadingCalculation2 {
    void sum(int a, int b) {
        System.out.println("int arg method invoked");
    }

    void sum(long a, long b) {
        System.out.println("long arg method invoked");
    }
}

public class OverloadingArguments {
    public static void main(String[] args) {
        System.out.println(Adder.add(1, 2));
        System.out.println(Adder.add(1, 2, 3));
        System.out.println(Adder2.add(11, 11));
        System.out.println(Adder2.add(12.3, 12.6));
        OverloadingCalculation1 obj = new OverloadingCalculation1();
        obj.sum(20, 20);
        obj.sum(20, 20, 20);
        OverloadingCalculation2 obj2 = new OverloadingCalculation2();
        obj2.sum(20, 20);
    }
}
