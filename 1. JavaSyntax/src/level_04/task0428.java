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

public class task0428 {
    public static void main(String[] args) throws Exception {
        int a = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        int b = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        int c = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

        int i = 0;
        if (a > 0) i++;
        if (b > 0) i++;
        if (c > 0) i++;
        if (i == 0) System.out.println(0);
        else if (i > 0) System.out.println(i);
    }
}
