/*
Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
Если все числа равны, вивести любое из них.
 */

package level_04;
import java.io.*;

public class task0441 {
    public static void main (String []args) throws Exception {
        int a = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        int b = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        int c = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

        if(a == b && b == c) System.out.println(a);
        else if((a > b && b > c)||(c > b && b > a)) System.out.println(b);
        else if((b > a && a > c)||(c > a && a > b)) System.out.println(a);
        else if((a > c && c > b)||(b > c && c > a)) System.out.println(c);
    }
}
