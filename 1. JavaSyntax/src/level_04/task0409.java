/*
Ближайшее к 10
Реализовать метод closeToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то вывести на экран любое из них.
Подсказка: используйте метод public static int abs(int a), который возвращает абсолютную величину числа.
 */

package level_04;

public class task0409 {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(-15, -8);
    }

    public static void closeToTen(int a, int b) {
        if (abs(10 - abs(a)) < abs(10 - abs(b))) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
