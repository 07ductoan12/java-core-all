package TestPackage;

import TestPackage.A;

public class B {
    public static void main(String args[]) {
        A obj = new A();// Compile Time Error
        obj.msg();// Compile Time Error
    }
}