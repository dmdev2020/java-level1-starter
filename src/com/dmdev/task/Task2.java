package com.dmdev.task;

/**
 * 2. Дано целое число. Определить, является ли последняя цифра этого числа – цифрой 3.
 */
public class Task2 {

    public static void main(String[] args) {
        int value = 912313;
        int testValue = value % 10;
        if (testValue == 3) {
            System.out.println("Последня цифра числа является 3");
        }
    }
}
