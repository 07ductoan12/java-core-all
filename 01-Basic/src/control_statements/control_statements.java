public class control_statements {
    public static void ifElseExample() {
        int number = 13;
        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("oll number");
        }
        int year = 2023;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("LEAP YEAR");
        } else {
            System.out.println("COMMON YEAR");
        }
    }

    public static void ifElseTernaryExample() {
        int number = 13;
        String output = (number % 2 == 0) ? "even number" : "old number";
        System.out.println(output);
    }

    public static void ifElseIfLadderStatement() {
        int marks = 65;

        if (marks < 50) {
            System.out.println("fail");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A grade");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("Invalid!");
        }
    }

    public static void positiveNegativeExample() {
        int number = -13;
        if (number > 0) {
            System.out.println("POSITIVE");
        } else if (number < 0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("ZERO");
        }
    }

    public static void nestedIfExample() {
        int age = 20;
        int weight = 80;
        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            }
        }
    }

    public static void nestedIfExample2() {
        int age = 25;
        int weight = 48;
        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("You are not eligible to donate blood");
            }
        } else {
            System.out.println("Age must be greater than 18");
        }
    }

    public static void switchMonthExample() {
        int month = 7;
        String monthString = "";
        switch (month) {
            case 1:
                monthString = "1 - January";
                break;
            case 2:
                monthString = "2 - February";
                break;
            case 3:
                monthString = "3 - March";
                break;
            case 4:
                monthString = "4 - April";
                break;
            case 5:
                monthString = "5 - May";
                break;
            case 6:
                monthString = "6 - June";
                break;
            case 7:
                monthString = "7 - July";
                break;
            case 8:
                monthString = "8 - August";
                break;
            case 9:
                monthString = "9 - September";
                break;
            case 10:
                monthString = "10 - October";
                break;
            case 11:
                monthString = "11 - November";
                break;
            case 12:
                monthString = "12 - December";
                break;
            default:
                System.out.println("Invalid Month!");
        }
        System.out.println(monthString);
    }

    public static void switchVowelExample() {
        char ch = 'O';
        switch (ch) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            case 'A':
                System.out.println("Vowel");
                break;
            case 'E':
                System.out.println("Vowel");
                break;
            case 'I':
                System.out.println("Vowel");
                break;
            case 'O':
                System.out.println("Vowel");
                break;
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }

    public static void switchFallThrough() {
        int number = 10;
        switch (number) {
            case 10:
                System.out.println("10");
            case 20:
                System.out.println("20");
            case 30:
                System.out.println("30");
            default:
                System.out.println("Not in 10, 20 or 30");
        }
    }

    public static void nestedSwitchExample() {
        char branch = 'C';
        int collegeYear = 4;
        switch (collegeYear) {
            case 1:
                System.out.println("English, Maths, Science");
                break;
            case 2:
                switch (branch) {
                    case 'C':
                        System.out.println("Operating System, Java, Data Structure");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch (branch) {
                    case 'C':
                        System.out.println("Computer Organization, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;
            case 4:
                switch (branch) {
                    case 'C':
                        System.out.println("Data Communication and Networks, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Embedded System, Image Processing");
                        break;
                    case 'M':
                        System.out.println("Production Technology, Thermal Engineering");
                        break;
                }
                break;
        }
    }

    public enum Day {
        Sun, Mon, Tue, Wed, Thu, Fri, Sat
    }

    public static void switchEnumExample() {
        Day[] DayNow = Day.values();
        for (Day Now : DayNow) {
            switch (Now) {
                case Sun:
                    System.out.println("Sunday");
                    break;
                case Mon:
                    System.out.println("Monday");
                    break;
                case Tue:
                    System.out.println("Tuesday");
                    break;
                case Wed:
                    System.out.println("Wednesday");
                    break;
                case Thu:
                    System.out.println("Thursday");
                    break;
                case Fri:
                    System.out.println("Friday");
                    break;
                case Sat:
                    System.out.println("Saturday");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        ifElseExample();
        ifElseTernaryExample();
        ifElseIfLadderStatement();
        positiveNegativeExample();
        nestedIfExample();
        nestedIfExample2();
        switchMonthExample();
        switchVowelExample();
        switchFallThrough();
        nestedSwitchExample();
        switchEnumExample();
    }
}
