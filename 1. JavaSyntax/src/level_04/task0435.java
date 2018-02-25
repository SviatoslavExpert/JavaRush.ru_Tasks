/*
Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Каждое значение вывести с новой строки.
 */

package level_04;

public class task0435 {
    public static void main (String []args) throws Exception {
        for (int i = 1; i < 101; i++){
            if(i % 2 == 0) System.out.println(i);
        }
    }
}
