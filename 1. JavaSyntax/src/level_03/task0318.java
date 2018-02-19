/*
План по захвату мира
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!
 */

package level_03;

import java.io.*;

public class task0318 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
        String name = r.readLine();
        int age = Integer.parseInt(r.readLine());
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
    }
}
