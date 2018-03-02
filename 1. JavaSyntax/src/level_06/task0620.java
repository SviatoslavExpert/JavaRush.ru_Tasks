/*
Исправляем ошибки юности
Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде «Max is 25».
 */
package level_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task0620 {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader (new InputStreamReader(System.in));

        String s = "Max is ";
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        task0620.max = a > b ? a : b;
        System.out.println(s + task0620.max);
    }
}
