/*
Предсказание на будущее
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
 */

package level_03;

import java.io.*;

public class task0319 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
        String name = r.readLine();
        int num1 = Integer.parseInt(r.readLine());
        int num2 = Integer.parseInt(r.readLine());
        System.out.println(name + " получает " + num1 + " через " + num2 + " лет." );
    }
}
