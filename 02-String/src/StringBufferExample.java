public class StringBufferExample {
    static void exampleInsertMethod() {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.insert(1, "Java");// now original string is changed
        System.out.println(sb);// prints HJavaello
    }

    static void exampleDeleteMethod() {
        StringBuffer sb = new StringBuffer("Hello");
        sb.delete(1, 3);
        System.out.println(sb);// prints Hlo
    }

    static void exampleReverseMethod() {
        StringBuffer sb = new StringBuffer("Hello");
        sb.reverse();
        System.out.println(sb);// prints olleH
    }

    static void exampleCapacityMethod() {
        // The capacity() method of the StringBuffer class returns the current capacity
        // of the buffer.
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());// default 16
        sb.append("Hello");
        System.out.println(sb.capacity());// now 16
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
    }

    static void exampleEnsureCapacityMethod() {
        // The ensureCapacity() method of the StringBuffer class ensures that the given
        // capacity is the minimum to the current capacity.
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());// default 16
        sb.append("Hello");
        System.out.println(sb.capacity());// now 16
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
        sb.ensureCapacity(10);// now no change
        System.out.println(sb.capacity());// now 34
        sb.ensureCapacity(50);// now (34*2)+2
        System.out.println(sb.capacity());// now 70
    }

    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java");// now original string is changed
        System.out.println(sb);// prints Hello Java
        exampleInsertMethod();
        exampleDeleteMethod();
        exampleReverseMethod();
        exampleCapacityMethod();
        exampleEnsureCapacityMethod();
    }

}
