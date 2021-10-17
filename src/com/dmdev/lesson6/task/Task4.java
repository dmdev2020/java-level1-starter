package com.dmdev.lesson6.task;

/**
 * 4. Написать программу, определяющую, является ли введённое
 *    целое число простым, т.е. делится без остатка только на 1 и само
 *    на себя.
 */
public class Task4 {

    public static void main(String[] args) {
        int value = 33;
        boolean result = isSimple(value);
        System.out.println(result);
    }

    public static boolean isSimple(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
