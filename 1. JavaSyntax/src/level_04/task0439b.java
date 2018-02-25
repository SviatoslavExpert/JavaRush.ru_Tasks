/*
Письмо счастья
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* любит меня.]
Пример вывода на экран для имени Света:
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
 */

package level_04;
import java.util.Scanner;

public class task0439b {
    public static void main (String []args) throws Exception{
        String name = (new Scanner(System.in)).nextLine();
        for (int i = 0; i < 10; i++) System.out.println(name + " любит меня.");
    }
}
