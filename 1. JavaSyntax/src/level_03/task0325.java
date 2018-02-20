/*
Финансовые ожидания
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
 */

package level_03;

import java.io.*;

public class task0325 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        System.out.println("Я буду зарабатывать $" + n + " в час");
    }
}
