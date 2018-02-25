/*
Хорошего много не бывает
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.
Пример ввода:
абв
2
Пример вывода:
абв
абв
 */

package level_04;
import java.io.*;

public class task0432 {
    public static void main(String []args) throws Exception {
        String s = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        int N = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        while (N-- > 0) { System.out.println(s); }
    }
}
