import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Student {
    int rollno;
    String name;
    String city;

    Student(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public String toString() {// overriding the toString() method
        return rollno + " " + name + " " + city;
    }
}

public class StringMethodExample {
    static void tokenizerMethod() {
        StringTokenizer st = new StringTokenizer("my name is Toan", " ");
        while (st.hasMoreTokens()) // This method returns true if more tokens are available in the tokenizer String
                                   // otherwise returns false.
        {
            System.out.println(st.nextToken());
        }
        st = new StringTokenizer("Hello everyone I am a Java developer", " ");

        // This method calculates the number of tokens present in the tokenizer String.
        System.out.println(st.countTokens());

        while (st.hasMoreElements())// This method returns the same value as hasMoreTokens() method of
                                    // StringTokenizer class. The only difference is this class can implement the
                                    // Enumeration interface.
        {
            // nextElement() returns the next token object in the tokenizer String. It can
            // implement Enumeration interface.
            System.out.println(st.nextToken());
        }
    }

    static int countVowels(String s) {
        ArrayList<Character> al = new ArrayList<Character>();
        al.add('A');
        al.add('E');
        al.add('a');
        al.add('e');
        al.add('I');
        al.add('O');
        al.add('i');
        al.add('o');
        al.add('U');
        al.add('u');
        int countVowels = 0;
        for (int i = 0; i < s.length(); i++) { // length() method finds the length of a string.
            char c = s.charAt(i); // returns a char value at the given index number.
            for (int j = 0; j < al.size(); j++) {
                if (c == al.get(j)) {
                    countVowels++;
                }
            }
        }
        return countVowels;
    }

    static void compareToMethod() {
        // method compares the given string with the current string lexicographically.
        // It returns a positive number, negative number, or 0.
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "meklo";
        String s4 = "hemlo";
        String s5 = "flag";
        System.out.println(s1.compareTo(s2));// 0 because both are equal
        System.out.println(s1.compareTo(s3));// -5 because "h" is 5 times lower than "m"
        System.out.println(s1.compareTo(s4));// -1 because "l" is 1 times lower than "m"
        System.out.println(s1.compareTo(s5));// 2 because "h" is 2 times greater than "f"
    }

    static void concatMethod() {
        // method combines specified string at the end of this string. It returns a
        // combined string. It is like appending another string.
        String str1 = "Hello";
        String str2 = "Javatpoint";
        String str3 = "Reader";
        // Concatenating one string
        String str4 = str1.concat("Javatpoint");
        System.out.println(str4);
        // Concatenating multiple strings
        String str5 = str1.concat(str2).concat(str3);
        System.out.println(str5);
    }

    static void containsMethod() {
        // searches the sequence of characters in this string. It returns true if the
        // sequence of char values is found in this string otherwise returns false.
        String str = "Hello Javatpoint readers";
        boolean isContains = str.contains("Javatpoint");
        System.out.println(isContains);
        // Case Sensitive
        System.out.println(str.contains("javatpoint")); // false
    }

    static void endsWithMethod() {
        // checks if this string ends with a given suffix. It returns true if this
        // string ends with the given suffix; else returns false.
        String str = "Welcome to Javatpoint.com";
        System.out.println(str.endsWith("point"));
        if (str.endsWith(".com")) {
            System.out.println("String ends with .com");
        } else
            System.out.println("It does not end with .com");
    }

    static void equalsMethod() {
        // compares the two given strings based on the content of the string. If any
        // character is not matched, it returns false. If all characters are matched, it
        // returns true.
        String s1 = "javatpoint";
        String s2 = "javatpoint";
        String s3 = "JAVATPOINT";
        String s4 = "python";
        System.out.println(s1.equals(s2));// true because content and case is same
        System.out.println(s1.equals(s3));// false because case is not same
        System.out.println(s1.equals(s4));// false because content is not same

        // equalsIgnoreCase() compares the two given strings on the basis of the content
        // of the string irrespective of the case (lower and upper) of the string
        System.out.println(s1.equalsIgnoreCase(s3));// false because case is not same

    }

    static void formatMethod() {
        // returns the formatted string by given locale, format and arguments.
        String name = "sonoo";
        String sf1 = String.format("name is %s", name);
        String sf2 = String.format("value is %f", 32.33434);
        String sf3 = String.format("value is %32.12f", 32.33434);// returns 12 char fractional part filling with 0

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
        String str1 = String.format("%d", 101);
        String str2 = String.format("|%10d|", 101); // Specifying length of integer
        String str3 = String.format("|%-10d|", 101); // Left-justifying within the specified width
        String str4 = String.format("|% d|", 101);
        String str5 = String.format("|%010d|", 101); // Filling with zeroes
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }

    static void getCharsMethod() {
        // copies the content of this string into a specified char array.
        String str = new String("hello javatpoint how r u");
        char[] ch = new char[10];
        try {
            str.getChars(6, 16, ch, 0);
            /*
             * params in getChars
             * 
             * @param first srcBeginIndex The index from where copying of characters is
             * started.
             * 
             * @param second srcEndIndex The index which is next to the last character that
             * is
             * getting copied.
             * 
             * @param third Char[] destination The char array where characters from the
             * string that invokes the getChars() method is getting copied.
             * 
             * @param four int dstEndIndex: It shows the position in the destination array
             * from where the characters from the string will be pushed.
             * 
             * @return It doesn't return any value.
             */
            System.out.println(ch);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    static void stringGetBytesMethod() {
        // encoding of string into the sequence of bytes and keeps it in an array of
        // bytes.
        // input string
        String str = "Welcome to JavaTpoint.";
        System.out.println("The input String is : ");
        System.out.println(str + "\n");
        try {
            // 16 - bit UCS Transformation format
            byte[] byteArr = str.getBytes("UTF-16");
            System.out.println("After converted into UTF-16 the String is : ");
            for (int i = 0; i < byteArr.length; i++)
                System.out.print(byteArr[i] + " ");
            System.out.println("\n");

            // Big Endian byte order, 16 - bit UCS Transformation format
            byte[] byteArr1 = str.getBytes("UTF-16BE");
            System.out.println("After converted into UTF-16BE the String is : ");

            for (int j = 0; j < byteArr1.length; j++) {
                System.out.print(byteArr1[j]);
            }

            System.out.println("\n");

            // ISO Latin Alphabet
            byte[] byteArr2 = str.getBytes("ISO-8859-1");
            System.out.println("After converted into ISO-8859-1 the String is : ");

            for (int j = 0; j < byteArr2.length; j++) {
                System.out.print(byteArr2[j]);
            }

            System.out.println("\n");

            // Little Endian byte order, 16 - bit UCS Transformation format
            byte[] byteArr3 = str.getBytes("UTF-16LE");
            System.out.println("After converted into UTF-16LE the String is : ");

            for (int j = 0; j < byteArr3.length; j++) {
                System.out.print(byteArr3[j]);
            }
            System.out.println("\n");

        } catch (UnsupportedEncodingException e) {
            System.out.println("Unsupported character set" + e);
        }
    }

    static void indexOfMethod() {
        // returns the position of the first occurrence of the specified character or
        // string in a specified string.
        String s1 = "this is index of example";
        // passing substring
        int index1 = s1.indexOf("is");// returns the index of is substring
        int index2 = s1.indexOf("index");// returns the index of index substring
        System.out.println(index1 + "  " + index2);// 2 8

        // passing substring with from index
        int index3 = s1.indexOf("is", 4);// returns the index of is substring after 4th index
        System.out.println(index3);// 5 i.e. the index of another is

        // passing char value
        int index4 = s1.indexOf('s');// returns the index of s char value
        System.out.println(index4);// 3
    }

    static void internMethod() {
        // returns the interned string. It returns the canonical representation of
        // string.
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = s1.intern();// returns string from pool, now it will be same as s2
        System.out.println(s1 == s2);// false because reference variables are pointing to different instance
        System.out.println(s2 == s3);// true because reference variables are pointing to same instance
    }

    public static void main(String[] args) {
        // toString method
        Student s1 = new Student(101, "Raj", "lucknow");
        Student s2 = new Student(102, "Vijay", "ghaziabad");

        System.out.println(s1);// compiler writes here s1.toString()
        System.out.println(s2);// compiler writes here s2.toString()

        // tokenizer
        tokenizerMethod();

        // charAt()
        System.out.println(countVowels("Javatpoint is a great site for learning Java."));

        // compareTo()
        compareToMethod();

        // concat()
        concatMethod();

        // contains()
        containsMethod();

        // endsWith()
        endsWithMethod();

        // equals method
        equalsMethod();

        // format method
        formatMethod();

        // string getByte()
        stringGetBytesMethod();

        // indexof()
        indexOfMethod();

        // intern()
        internMethod();
    }
}
