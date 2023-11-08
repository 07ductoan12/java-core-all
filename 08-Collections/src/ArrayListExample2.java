import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {
    static void serializeAndDeserialize() {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");

        try {
            // Serialization
            FileOutputStream fos = new FileOutputStream("file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(al);
            fos.close();
            oos.close();
            // Deserialization
            FileInputStream fis = new FileInputStream("file");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList list = (ArrayList) ois.readObject();
            System.out.println(list);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    static void addElementsExample() {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial list of elements: " + al);
        // Adding elements to the end of the list
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        System.out.println("After invoking add(E e) method: " + al);
        // Adding an element at the specific position
        al.add(1, "Gaurav");
        System.out.println("After invoking add(int index, E element) method: " + al);
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Sonoo");
        al2.add("Hanumat");
        // Adding second list elements to the first list
        al.addAll(al2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: " + al);
        ArrayList<String> al3 = new ArrayList<String>();
        al3.add("John");
        al3.add("Rahul");
        // Adding second list elements to the first list at specific position
        al.addAll(1, al3);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + al);
    }

    static void removeElementExample() {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        al.add("Anuj");
        al.add("Gaurav");
        System.out.println("An initial list of elements: " + al);
        // Removing specific element from arraylist
        al.remove("Vijay");
        System.out.println("After invoking remove(object) method: " + al);
        // Removing element on the basis of specific position
        al.remove(0);
        System.out.println("After invoking remove(index) method: " + al);

        // Creating another arraylist
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Hanumat");
        // Adding new elements to arraylist
        al.addAll(al2);
        System.out.println("Updated list : " + al);
        // Removing all the new elements from arraylist
        al.removeAll(al2);
        System.out.println("After invoking removeAll() method: " + al);
        // Removing elements on the basis of specified condition
        al.removeIf(str -> str.contains("Ajay")); // Here, we are using Lambda expression
        System.out.println("After invoking removeIf() method: " + al);
        // Removing all the elements available in the list
        al.clear();
        System.out.println("After invoking clear() method: " + al);
    }

    public static void main(String[] args) {
        // Creating user-defined class objects
        Student s1 = new Student(101, "Sonoo", 23);
        Student s2 = new Student(102, "Ravi", 21);
        Student s3 = new Student(103, "Hanumat", 25);
        // creating arraylist
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s1);// adding Student class object
        al.add(s2);
        al.add(s3);
        // Getting Iterator
        Iterator itr = al.iterator();
        // traversing elements of ArrayList object
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
        System.out.println("---------------------------------");
        serializeAndDeserialize();
        System.out.println("---------------------------------");
        addElementsExample();
        System.out.println("---------------------------------");
        removeElementExample();
    }
}
