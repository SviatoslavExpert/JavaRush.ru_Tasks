/*
Существует ли пара?
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
 */

package level_04;
import java.io.*;

public class task0417 {
    public static void main (String []args) throws Exception{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());

        if(a == b && b == c ) System.out.println(a + " " + b + " " + c);
        else if(a == b) System.out.println(a + " " + b);
        else if(a == c) System.out.println(a + " " + c);
        else if(b == c) System.out.println(b + " " + c);
    }
}
