/*
Фейс-контроль
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
 */

package level_04;
import java.io.*;

public class task0423 {
    public static void main (String []args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String name = r.readLine();
        int age = Integer.parseInt(r.readLine());
        if(age > 20) System.out.println("И 18-ти достаточно");
    }
}
