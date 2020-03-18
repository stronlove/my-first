package com.lhr.learn.demo04;

import java.lang.reflect.Array;

public class OverLoad {
    public static void main(String[] args) {
        System.out.println(sum(12, 2, 5, 6));
        Arriy();
        Arriy1();
        Arriy2();
    }

    public static int sum(int a, int b) {
        int result;
        result = a + b;
        return result;
    }

    public static int sum(int a, int b, int c) {
        int result;
        result = a + b + c;
        return result;
    }

    public static int sum(int a, int b, int c, int d) {
        int result;
        result = a + b + c + b;
        return result;
    }

    public static void Arriy() {
        int[] a = {1, 2, 3, 4, 5, 1};//静态初始化，指定内容
        for (int i = 0; i < 6; i++) {
            System.out.println(a[i]);
        }
    }
    public static void Arriy1(){
            int [] a = new int[10];//动态初始化，指定长度
        System.out.println(a.length);
    }
    public static int Arriy2(){
            int [][] b = new int[1][2];
        System.out.println(b.length);
        return b.length;
    }
}
