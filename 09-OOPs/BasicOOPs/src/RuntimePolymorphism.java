
class Bike {
    void run() {
        System.out.println("running");
    }
}

class Splendor extends Bike {
    void run() {
        System.out.println("running safely with 60km");
    }
}

class Animal {
    void eat() {
        System.out.println("eating");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("eating fruits");
    }
}

class BabyDog extends Dog {
    void eat() {
        System.out.println("drinking milk");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Bike b = new Splendor();// upcasting
        b.run();
        Animal a1, a2, a3;
        a1 = new Animal();
        a2 = new Dog();
        a3 = new BabyDog();
        a1.eat();
        a2.eat();
        a3.eat();
        // static binding
        Dog d1 = new Dog();
        d1.eat();
        // dynamic binding
        Animal a = new Dog();
        a.eat();
    }
}
