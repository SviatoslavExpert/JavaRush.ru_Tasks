/*
Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Каждое значение вывести с новой строки.
 */

package level_04;

public class task0435b {
    public static void main (String []args) throws Exception {
        for(int i = 2; i <= 100; i += 2)  System.out.println(i);
    }
}
