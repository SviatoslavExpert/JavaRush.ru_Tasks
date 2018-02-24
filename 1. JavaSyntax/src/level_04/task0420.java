/*
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.
 */

package level_04;
import java.io.*;

public class task0420 {

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());

        if (a >= b && b >= c) System.out.println(a + " " + b + " " + c);
        else if (a >= c && c >= b) System.out.println(a + " " + c + " " + b);
        else if (b >= a && a >= c) System.out.println(b + " " + a + " " + c);
        else if (b >= c && c >= a) System.out.println(b + " " + c + " " + a);
        else if (c >= a && a >= b) System.out.println(c + " " + a + " " + b);
        else if (c >= b && b >= a) System.out.println(c + " " + b + " " + a);
    }
}
