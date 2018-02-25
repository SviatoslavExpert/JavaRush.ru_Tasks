/*
Суммирование
Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
-1 должно учитываться в сумме.
*/

package level_04;
import java.io.*;

public class task0442 {
    public static void main (String []args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int x = 0, summa = 0;
        while(x != -1){
            x = Integer.parseInt(r.readLine());
            summa += x;
        }
        System.out.println(summa);
    }
}
