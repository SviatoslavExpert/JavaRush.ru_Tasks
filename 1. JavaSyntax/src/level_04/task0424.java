/*
Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
 */

package level_04;
import java.io.*;

public class task0424 {
    public static void main (String []args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());

        if(a != b && a != c) System.out.println(1);
        else if(b != a && b != c) System.out.println(2);
        else if(c != a && c != b) System.out.println(3);
    }
}
