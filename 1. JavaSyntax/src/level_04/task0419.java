/*
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.
 */

package level_04;

import java.io.*;

public class task0419 {

    public static void main (String []args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());
        int d = Integer.parseInt(r.readLine());

        System.out.println(sort(sort(a,b),sort(c,d)));   //  !!!!!!!!!!
    }

    public static int sort(int x, int y){
        if (x > y) return x;
        else return y;
    }
}
