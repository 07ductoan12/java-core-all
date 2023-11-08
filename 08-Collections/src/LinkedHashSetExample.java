import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    static void linkedHashSetExample() {
        // Creating HashSet and adding elements
        LinkedHashSet<String> set = new LinkedHashSet();
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
        LinkedHashSet<String> al = new LinkedHashSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        linkedHashSetExample();
        System.out.println("-----------------------------------");
        ignoringDuplicateElements();
    }
}
