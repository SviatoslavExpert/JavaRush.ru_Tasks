/*
Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
 */

package level_04;
import java.io.*;

public class task0436 {
    public static void main (String []args) throws Exception {
        int m = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        int n = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(8);
            }
            System.out.println();
        }
    }

}
