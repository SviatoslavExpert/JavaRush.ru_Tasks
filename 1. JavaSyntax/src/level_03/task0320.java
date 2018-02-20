/*
Скромность украшает программиста
Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!
Пример: Тимур зарабатывает $5,000. Ха-ха-ха!
 */

package level_03;

import java.io.*;

public class task0320 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
        String name = r.readLine();
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
