package com.lhr.learn.demo02;

public class SericeSum {
    public static void main(String[] args) {
        System.out.println(SerSum());
    }
    public static int SerSum(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
