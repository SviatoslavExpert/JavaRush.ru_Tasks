/*
Напиши программу, которая считывает с клавиатуры целое число a и выводит квадрат этого числа (a * a).
Для считывания данных с клавиатуры используй метод nextInt() класса Scanner.
Требования:
1. Программа должна выводить текст.
2. В программе необходимо создать объект типа Scanner.
3. Программа должна считывать данные с клавиатуры.
4. Программа должна выводить квадрат считанного числа.
 */

package level_01;
import java.util.Scanner;

public class task0140 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        System.out.print(a * a);
    }
}
