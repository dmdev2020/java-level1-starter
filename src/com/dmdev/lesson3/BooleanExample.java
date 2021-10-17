package com.dmdev.lesson3;

public class BooleanExample {

    public static void main(String[] args) {
        int value1 = 0;
        int value2 = 10;
        boolean test = value1 != 0;
        boolean test2 = value2 > 0;
        System.out.println(test || test2 || 25 > 100);
    }
}
