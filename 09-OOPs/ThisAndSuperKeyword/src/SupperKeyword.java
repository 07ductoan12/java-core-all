
class Animal {
    String color = "white";

    Animal() {
        System.out.println("animal is created");
    }

    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    String color = "black";

    Dog() {
        // super is used to invoke parent class constructor.
        super();
        System.out.println("dos is created");
    }

    void printColor() {
        // super is used to refer immediate parent class instance variable.
        System.out.println(color);// prints color of Dog class
        System.out.println(super.color);// prints color of Animal class
    }

    void eat() {
        System.out.println("eating bread...");
    }

    void bark() {
        System.out.println("barking...");
    }

    void work() {
        // super can be used to invoke parent class method
        super.eat();
        bark();
    }
}

class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Emp extends Person {
    float salary;

    Emp(int id, String name, float salary) {
        super(id, name);// reusing parent constructor
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class SupperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
        d.work();
        Emp e1 = new Emp(1, "ankit", 45000f);
        e1.display();
    }
}
