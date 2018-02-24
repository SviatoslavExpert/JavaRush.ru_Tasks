/*
Положительное число
Ввести с клавиатуры три целых числа.
Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
 */

package level_04;
import java.io.*;

public class task0428b {
    public static void main(String[] args) throws Exception {
        int number = 0;
        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
            if (a > 0) number++;
        }
        System.out.println(number);
    }
}
