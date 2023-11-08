public class StringBuilderExample {
    static void exampleMethod() {
        // insert method
        StringBuilder sb = new StringBuilder("Hello ");
        sb.insert(1, "Java");// now original string is changed
        System.out.println(sb);// prints HJavaello

        // delete method
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.delete(1, 3); // 1: start, 3: end
        System.out.println(sb1);

        // reverse method
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.reverse();
        System.out.println(sb2);

        // capacity
        StringBuilder sb3 = new StringBuilder();
        System.out.println(sb3.capacity());// default 16
        sb3.append("Hello");
        System.out.println(sb3.capacity());// now still 16
        sb3.append("Java is my favourite language");
        System.out.println(sb3.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2

        // ensureCapacity
        StringBuilder sb4 = new StringBuilder();
        System.out.println(sb4.capacity());// default 16
        sb4.append("Hello");
        System.out.println(sb4.capacity());// now 16
        sb4.append("Java is my favourite language");
        System.out.println(sb4.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
        sb4.ensureCapacity(10);// now no change
        System.out.println(sb4.capacity());// now 34
        sb4.ensureCapacity(50);// now (34*2)+2
        System.out.println(sb4.capacity());// now 70
    }

    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("Java");// now original string is changed
        System.out.println(sb);// prints Hello Java
        exampleMethod();
    }
}
