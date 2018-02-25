/*
Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
 */

package level_04;
import java.util.Scanner;

public class task0436b {
    public static void main (String []args) throws Exception {
        int m = (new Scanner (System.in)).nextInt();
        int n = (new Scanner (System.in)).nextInt();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
