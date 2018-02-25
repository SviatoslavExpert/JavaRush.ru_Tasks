/*
Как назвали, так назвали
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name.
Я родился d.m.y»

Пример вывода:
Меня зовут Вася.
Я родился 15.2.1988
 */

package level_04;
import java.io.*;

public class task0443 {
    public static void main (String []args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String name = r.readLine();
        int date = Integer.parseInt(r.readLine());
        int month = Integer.parseInt(r.readLine());
        int year = Integer.parseInt(r.readLine());
        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + date + "." + month + "." + year);
    }
}

