/*
Конвертируем время
Добавь метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызови его дважды в методе main с любыми параметрами. Результаты выведи на экран, каждый раз с новой строки.
 */

package level_03;

public class task0312 {
    public static void main(String[] args) {
        System.out.println(convertToSeconds(3));
        System.out.println(convertToSeconds(5));
    }
    public static int convertToSeconds(int hour) {
        return hour * 3600;
    }
}
