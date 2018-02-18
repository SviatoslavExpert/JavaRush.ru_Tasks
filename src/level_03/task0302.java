/*
Обмен валют
Реализуй метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызови его дважды в методе main с любыми параметрами. Результаты выведи на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
 */

package level_03;

public class task0302 {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(1, 0.86));
        System.out.println(convertEurToUsd(3, 0.86));
    }
    public static double convertEurToUsd(int eur, double course){
        return eur * course;
    }
}

