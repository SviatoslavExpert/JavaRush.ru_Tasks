/*
День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
 */

package level_04;

import java.io.*;

public class task0413b {

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int month = Integer.parseInt(r.readLine());
        if (month == 1) {
            System.out.println("понедельник");
            return;
        }
        if (month == 2) {
            System.out.println("вторник");
            return;
        }
        if (month == 3) {
            System.out.println("среда");
            return;
        }
        if (month == 4) {
            System.out.println("четверг");
            return;
        }
        if (month == 5) {
            System.out.println("пятница");
            return;
        }
        if (month == 6) {
            System.out.println("суббота");
            return;
        }
        if (month == 7) {
            System.out.println("воскресенье");
            return;
        }
        if (month < 1 || month > 7) {
            System.out.println("такого дня недели не существует");
            return;
        }
    }
}
