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
import java.util.Scanner;

public class task0443b {
    public static void main (String []args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int date = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + date + "." + month + "." + year);
    }
}

