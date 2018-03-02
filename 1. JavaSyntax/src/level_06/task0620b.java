/*
Исправляем ошибки юности
Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде «Max is 25».
 */
package level_06;

import java.io.*;

public class task0620b {
    public static int max = 100;

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader (new InputStreamReader(System.in));

        String s = "Max is ";
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int max = a > b ? a : b;
        System.out.println(s + max);
    }
}
