package com.dmdev.lesson6;

public class WhileExample {

    public static void main(String[] args) {
        int value = 0;
        do {
            System.out.println(value);
            value++; // value += 1; value = value + 1;
        } while (value < 10);
    }

    private static void whileExample() {
        int value = 10;
        while (value > 0) {
            System.out.println(value);
            value--; // value = value - 1;
        }
    }
}
