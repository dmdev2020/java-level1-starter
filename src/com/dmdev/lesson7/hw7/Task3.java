package com.dmdev.lesson7.hw7;

import java.util.Arrays;

/**
 * Заданы 2 массива целых чисел произвольной длины. 
 *     Написать программу, создающую третий массив,
 * представляющий собой слияние 2-х заданных.
 * Пример:
 * 1-й массив: {1, 2, 3, 4, 5}
 * 2-й массив: {5, 6, 7}
 * Результат: {1, 5, 2, 6, 3, 7, 4, 5}
 */
public class Task3 {

    public static void main(String[] args) {
        int[] values1 = {1, 2, 3, 4, 5};
        int[] values2 = {5, 6, 7};

        int[] mergedValues = mergeArrays(values1, values2);
        System.out.println(Arrays.toString(mergedValues));
    }

    private static int[] mergeArrays(int[] values1, int[] values2) {
        int[] resultArray = new int[values1.length + values2.length];
        for (int i = 0, index1 = 0, index2 = 0; i < resultArray.length; ) {
            if (index1 < values1.length && index2 < values2.length) {
                resultArray[i++] = values1[index1++];
                resultArray[i++] = values2[index2++];
            } else if (index1 < values1.length) {
                resultArray[i++] = values1[index1++];
            } else {
                resultArray[i++] = values2[index2++];
            }
        }

        return resultArray;
    }
}
