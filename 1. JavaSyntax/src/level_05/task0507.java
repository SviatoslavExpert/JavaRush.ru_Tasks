/*
Среднее арифметическое
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
Пример для чисел 1 2 2 4 5 -1:
2.8
Пример для чисел 4 3 2 1 -1:
2.5
 */
package level_05;
import java.io.*;

public class task0507 {
    public static void main (String []args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int number = 0, counter = 0;
        double sum = 0;
        while (number != -1) {
            number = Integer.parseInt(r.readLine());
            if (number != -1) {
                sum += number;
                counter++;
            }
        }
        System.out.print(sum/counter);
    }
}
