package com.dmdev.lesson7;

public class ArrayExample2 {

    public static void main(String[] args) {
        int[][] values = new int[3][];
        values[0] = new int[5];
        values[1] = new int[2];
        values[2] = new int[1];
        printArray(values);
    }

    private static void test() {
        int[] values = {1, 2, 3, 4, 5};
        int[][] values2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {0}
        };
        printArray(values2);
    }

    private static void printArray(int[][] values2) {
        for (int i = 0; i < values2.length; i++) {
            int[] ints = values2[i];
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
