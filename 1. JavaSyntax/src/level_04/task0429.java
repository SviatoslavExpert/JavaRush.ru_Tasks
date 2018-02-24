/*
Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
 */

package level_04;
import java.io.*;

public class task0429 {
    public static void main(String[] args) throws Exception {
        int positiveNumber = 0, negativeNumber = 0;
        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
            if (a > 0) positiveNumber++;
            else if(a < 0) negativeNumber++;
        }
        System.out.println("количество отрицательных чисел: " + negativeNumber + "," + " количество положительных чисел: " + positiveNumber);
    }
}
