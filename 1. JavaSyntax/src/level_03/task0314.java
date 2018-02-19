/*
Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
 */

package level_03;

public class task0314 {
    public static void main(String[] args) {
        int count = 11;
        for (int j = 1; j < count; j++) {
            for (int i = 1; i < count; i++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
