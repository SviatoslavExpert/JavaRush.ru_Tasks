/*
Числа по возрастанию
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
 */
package level_06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class task0622 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
