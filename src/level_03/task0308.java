/*
Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10. Результат - это 1 число.
Подсказка: будет три миллиона с хвостиком.
 */

package level_03;

public class task0308 {
    public static void main(String[] args) {
        int count = 10, sum = 1;
        for (int i = 1; i <= count; i ++){
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
