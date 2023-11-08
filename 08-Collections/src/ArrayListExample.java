import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
    static void example1() {
        ArrayList l = new ArrayList();// creating old non-generic arraylist
        ArrayList<String> list = new ArrayList<String>(); // creating new generic arraylist
        list.add("Mango");// Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        // Printing the arraylist object
        System.out.println(list);
    }

    static void example2() {
        ArrayList<String> list = new ArrayList<String>();// Creating arraylist
        list.add("Mango");// Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        // Traversing list through Iterator
        Iterator itr = list.iterator();// getting the Iterator
        while (itr.hasNext()) {// check if iterator has the elements
            System.out.println(itr.next());// printing the element and move to next
        }
        // Traversing list through for-each loop
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // accessing the element
        System.out.println("Returning element: " + list.get(1));// it will return the 2nd element, because index starts
                                                                // from 0
        // changing the element
        list.set(1, "Dates");
        // Traversing list
        for (String fruit : list)
            System.out.println(fruit);
    }

    static void sortArrayList() {
        // Creating a list of fruits
        List<String> list1 = new ArrayList<String>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");
        // Sorting the list
        Collections.sort(list1);
        // Traversing list through the for-each loop
        for (String fruit : list1)
            System.out.println(fruit);

        System.out.println("Sorting numbers...");
        // Creating a list of numbers
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);
        // Sorting the list
        Collections.sort(list2);
        // Traversing list through the for-each loop
        for (Integer number : list2)
            System.out.println(number);
    }

    static void arrayList() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");// Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        System.out.println("Traversing list through List Iterator:");
        // Here, element iterates in reverse order
        ListIterator<String> list1 = list.listIterator(list.size());
        while (list1.hasPrevious()) {
            String str = list1.previous();
            System.out.println(str);
        }
        System.out.println("Traversing list through for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Traversing list through forEach() method:");
        // The forEach() method is a new feature, introduced in Java 8.
        list.forEach(a -> { // Here, we are using lambda expression
            System.out.println(a);
        });
        System.out.println("Traversing list through forEachRemaining() method:");
        Iterator<String> itr = list.iterator();
        itr.forEachRemaining(a -> {
            System.out.println(a);
        });
    }

    public static void main(String[] args) {
        example1();
        System.out.println("-------------------------------------");
        example2();
        System.out.println("-------------------------------------");
        sortArrayList();
        System.out.println("-------------------------------------");
        arrayList();
    }
}
