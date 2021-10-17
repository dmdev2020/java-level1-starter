package com.dmdev.lesson7.hw7;

import java.util.Arrays;

/**
 * Написать программу, удаляющую все повторяющиеся целые
 * числа из массива и печатающую результат. Массив должен
 * использоваться тот же самый. На место удаленных элементов
 * ставить цифру 0.
 */
public class Task2 {

    public static void main(String[] args) {
        int[] values = {1, 6, 1, 4, 8, 9, 9, 6, 7, 5};

        removeDuplicates(values);
        System.out.println(Arrays.toString(values));
    }

    private static void removeDuplicates(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] == values[j]) {
                    values[j] = 0;
                }
            }
        }
    }
}
