package com.dmdev.lesson7.hw7;

import java.util.Arrays;

/**
 * Написать функцию linearize, которая принимает в качестве
 * параметра двумерный массив
 * и возвращает одномерный массив со всеми элементами
 * двумерного.
 */
public class Task4 {

    public static void main(String[] args) {
        int[][] values = {{1}, {2, 3}, {4, 5, 6}};

        int[] resultArray = linearize(values);
        System.out.println(Arrays.toString(resultArray));
    }

    private static int[] linearize(int[][] values) {
        int[] result = new int[calculateArraySize(values)];
        int currentIndex = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                result[currentIndex++] = values[i][j];
            }
        }
        return result;
    }

    private static int calculateArraySize(int[][] values) {
        int size = 0;
        for (int[] value : values) {
            size += value.length;
        }
        return size;
    }
}
