/*
Положительное и отрицательное число
Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.
 */

package level_04;

import java.io.*;

public class task0412 {
    public static void main (String []args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());

        if (a > 0) System.out.print(a *= 2);
        else if (a < 0) System.out.print(a += 1);
        else if (a == 0) System.out.print(a);
    }
}
