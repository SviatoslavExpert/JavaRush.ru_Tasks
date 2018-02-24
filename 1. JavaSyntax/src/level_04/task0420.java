/*
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.
 */

package level_04;

import java.io.*;

public class task0420 {

    public static void main (String []args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());

        if (((a <= b)&&(a <= c))&&((b >= a)&&(b >= c))) System.out.println(b + c + a);
}
