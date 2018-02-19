/*
Задача на проценты
Реализуй метод addTenPercent, который увеличивает переданное целое число на 10%.
Исправь ошибку в сигнатуре метода.
Подсказка: подумай, какие у этого метода входные и выходные данные.
 */

package level_03;

public class task0304 {
    public static double addTenPercent(int i) {
        return i * 1.1;
    }
    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
