/*
Сумма 10 чисел
Вывести на экран сумму чисел от 1 до 10 построчно (должно быть 10 строк):
1
1+2=3
1+2+3=6
1+2+3+4=10
...
Пример вывода:
1
3
6
10
...
 */

package level_03;

public class task0309 {
    public static void main(String[] args) {
        int sum = 0, count = 11;
        for (int i = 1; i < count; i++){
            sum += i;
            System.out.println(sum);
        }
    }
}
