class Simple1 {
}

class Animal1 {
}

class Dog1 extends Animal1 {
}

class Dog2 extends Animal1 {
    static void method(Animal1 a) {
        if (a instanceof Dog2) {
            Dog2 d = (Dog2) a;
            System.out.println("ok downcasting performed");
        }
    }
}

public class InstanceofOperator {
    public static void main(String[] args) {
        Simple1 s = new Simple1();
        System.out.println(s instanceof Simple1);
        Dog1 d1 = new Dog1();
        System.out.println(d1 instanceof Animal1);
        Animal1 a = new Dog2();
        Dog2.method(a);
    }

}
