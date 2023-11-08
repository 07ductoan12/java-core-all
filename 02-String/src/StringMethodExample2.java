import java.util.regex.Pattern;

public class StringMethodExample2 {
    static void isEmptyMethod() {
        // checks if the input string is empty or not
        String s1 = "";
        String s2 = "javatpoint";

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        String str = ""; // empty string
        String str1 = null; // null string. It is also not containing any characters.
        // isEmpty() method is not fit for checking the null strings.
    }

    static void joinMethod() {
        // returns a string joined with a given delimiter
        String joinString1 = String.join("-", "welcome", "to", "javatpoint");
        /*
         * params join()
         * 
         * @param delimiter : char value to be added with each element
         * 
         * @param elements : char value to be attached with delimiter
         * 
         * @return joined string with delimiter
         */
        System.out.println(joinString1);

        String str = null;

        // one of the element is null however it will be treated as normal string
        str = String.join("-", null, " wake up ", " eat ", " write content for JTP ", " eat ", " sleep ");
        System.out.println(str);
    }

    static void lastOfIndexMethod() {
        // returns the last index of the given character value or substring. If it is
        // not found, it returns -1. The index counter starts from zero.
        String s1 = "this is index of example";// there are 2 's' characters in this sentence
        int index = s1.lastIndexOf('s');// returns last index of 's' char value
        System.out.println(index);// 6
        index = s1.lastIndexOf('s', 5); // 5 is fromIndex: index position from where index of the char value or
                                        // substring is retured
        System.out.println(index);
    }

    static void replaceMethod() {
        // returns a string replacing all the old char or CharSequence to new char or
        // CharSequence.
        String str = "oooooo-hhhh-oooooo h hhh";
        String rs = str.replace("h", "s"); // Replace 'h' with 's'
        System.out.println(rs);
        rs = rs.replace("s", "h"); // Replace 's' with 'h'
        System.out.println(rs);
    }

    static void splitMethod() {
        // splits this string against given regular expression and returns a char array.
        String s1 = "welcome to split world";
        System.out.println("returning words:");
        for (String w : s1.split("\\s", 0)) {
            System.out.println(w);
        }
        System.out.println("returning words:");
        for (String w : s1.split("\\s", 1)) {
            System.out.println(w);
        }
        System.out.println("returning words:");
        for (String w : s1.split("\\s", 2)) {
            System.out.println(w);
        }
        System.out.println("returning words:");
        for (String w : s1.split("\\s", 3)) {
            System.out.println(w);
        }
    }

    static void startsWithMethod() {
        // checks if this string starts with the given prefix
        String s1 = "java string split method by javatpoint";
        System.out.println(s1.startsWith("ja")); // true
        System.out.println(s1.startsWith("java string")); // true
        System.out.println(s1.startsWith("Java string")); // false as 'j' and 'J' are different
        System.out.println(s1.startsWith("a")); // False
        // offset is 1
        System.out.println(s1.startsWith("a", 1)); // True
    }

    static void substringMethod() {
        // returns a part of the string.
        String s1 = "javatpoint";
        System.out.println(s1.substring(2, 4));// returns va
        System.out.println(s1.substring(2));// returns vatpoint

        String str[] = {
                "Praveen Kumar",
                "Yuvraj Singh",
                "Harbhajan Singh",
                "Gurjit Singh",
                "Virat Kohli",
                "Rohit Sharma",
                "Sandeep Singh",
                "Milkha Singh"
        };
        String surName = "Singh";
        int surNameSize = surName.length();
        int size = str.length;
        for (int j = 0; j < size; j++) {
            int length = str[j].length();
            String subStr = str[j].substring(length - surNameSize);
            if (subStr.equals(surName))
                System.out.println(str[j]);
        }
    }

    static void toCharArrayMethod() {
        // converts this string into character array. It returns a newly created
        // character array, its length is similar to this string and its contents are
        // initialized with the characters of this string.
        String s1 = "Welcome to Javatpoint";
        char[] ch = s1.toCharArray();
        int len = ch.length;
        System.out.println("Char Array length: " + len);
        System.out.println("Char Array elements: ");
        for (int i = 0; i < len; i++) {
            System.out.println(ch[i]);
        }
    }

    static void valueOfMethod() {
        // converts different types of values into string.
        float f = 10.05f;
        double d = 10.02;
        String s1 = String.valueOf(f);
        String s2 = String.valueOf(d);
        System.out.println(s1);
        System.out.println(s2);
    }

    static void javaRegex() {
        System.out.println(Pattern.matches("[amn]", "abcd"));// false (not a or m or n)
        System.out.println(Pattern.matches("[amn]", "a"));// true (among a or m or n)
        System.out.println(Pattern.matches("[amn]", "ammmna"));// false (m and a comes more than once)
        System.out.println(Pattern.matches(".s", "as"));// true (2nd char is s)
        System.out.println(Pattern.matches(".s", "mk"));// false (2nd char is not s)
        System.out.println(Pattern.matches(".s", "mst"));// false (has more than 2 char)
        System.out.println(Pattern.matches(".s", "amms"));// false (has more than 2 char)
        System.out.println(Pattern.matches("..s", "mas"));// true (3rd char is s)
    }

    public static void main(String[] args) {
        // isEmpty()
        isEmptyMethod();

        // join()
        joinMethod();

        // lastOfIndex()
        lastOfIndexMethod();

        // replace()
        replaceMethod();

        // split()
        splitMethod();

        // substring()
        substringMethod();

        // toCharArray()
        toCharArrayMethod();

        // valueOf()
        valueOfMethod();

        // regex
        javaRegex();
    }
}
