package com.lhr.learn.demo05;

public class OverLoadCharge {
    public static void main(String[] args) {
        System.out.println(charge(127, 127));
        System.out.println(charge(200, 100));
        System.out.println(charge(99999,9999999));
        System.out.println(charge(2.33,2.33));
    }

    public static boolean charge(byte a, byte b) {
        return a == b;
    }

    public static boolean charge(int a, int b) {
        return a == b;
    }

    public static boolean charge(long a, long b) {
        return a == b;
    }

    public static boolean charge(double a, double b) {
        return a == b;
    }
}
