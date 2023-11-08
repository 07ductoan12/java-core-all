import java.util.HashSet;
import java.util.Iterator;

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class HashSetExample {
    static void createExample() {
        HashSet<String> set = new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    static void ignoringDuplicateElements() {
        // Creating HashSet and adding elements
        HashSet<String> set = new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        // Traversing elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    static void removeElementsExample() {
        HashSet<String> set = new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        System.out.println("An initial list of elements: " + set);
        // Removing specific element from HashSet
        set.remove("Ravi");
        System.out.println("After invoking remove(object) method: " + set);
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println("Updated List: " + set);
        // Removing all the new elements from HashSet
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: " + set);
        // Removing elements on the basis of specified condition
        set.removeIf(str -> str.contains("Vijay"));
        System.out.println("After invoking removeIf() method: " + set);
        // Removing all the elements available in the set
        set.clear();
        System.out.println("After invoking clear() method: " + set);
    }

    static void bookExample() {
        HashSet<Book> set = new HashSet<Book>();
        // Creating Books
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        // Adding Books to HashSet
        set.add(b1);
        set.add(b2);
        set.add(b3);
        for (Book b : set) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }

    public static void main(String[] args) {
        createExample();
        System.out.println("----------------------------------");
        ignoringDuplicateElements();
        System.out.println("----------------------------------");
        removeElementsExample();
        System.out.println("----------------------------------");
        bookExample();
    }
}
