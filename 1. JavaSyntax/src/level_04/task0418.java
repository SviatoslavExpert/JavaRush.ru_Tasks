/*
Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.
 */

package level_04;
import java.io.*;

public class task0418 {
    public static void main (String []args)throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());

        if(a < b) System.out.println(a);
        else if (b < a) System.out.println(b);
        else System.out.println(a);
    }
}
