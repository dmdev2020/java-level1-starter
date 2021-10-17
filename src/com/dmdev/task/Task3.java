package com.dmdev.task;

/**
 * 3. Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
 * Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля")
 */
public class Task3 {

    public static void main(String[] args) {
        int rubles = 112;
//      рубль  1 !11
//      рублей 5, 6, 7, 8, 9, 10, 11-19
//      рубля 2, 3, 4
        if ((rubles % 10 == 1) && (rubles % 100 != 11)) {
            System.out.println(rubles + " рубль");
        } else if ((rubles % 10 == 2 || rubles % 10 == 3 || rubles % 10 == 4)
                && !(rubles % 100 == 12 || rubles % 100 == 13 || rubles % 100 == 14)) {
            System.out.println(rubles + " рубля");
        } else {
            System.out.println(rubles + " рублей");
        }
    }
}
