/*
18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
 */

package level_04;
import java.io.*;

public class task0422 {
    public static void main (String []args) throws Exception {
        BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
        String name = r.readLine();
        int age = Integer.parseInt(r.readLine());
        if(age < 18) System.out.println("Подрасти еще");
    }
}
