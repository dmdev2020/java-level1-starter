package com.dmdev.lesson6.task;

/**
 * 5. Написать программу, которая проходит циклом по английскому
 *    алфавиту, начиная с буквы ‘b’, и выводит каждую букву до тех пор,
 *    пока не встретит гласную (т.е. вывести согласные на консоль).
 */
public class Task5 {

    public static void main(String[] args) {
        printLetters();
    }

    public static void printLetters() {
        for (char letter = 'b'; !isVowel(letter); letter++) {
            System.out.println(letter);
        }
    }

    public static boolean isVowel(char value) {
        return value == 'a' || value == 'e' || value == 'y' || value == 'u' || value == 'i' || value == 'o';
    }
}
