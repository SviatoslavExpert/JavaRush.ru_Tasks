/*
Повторенье-мать
Реализуй метод print3. Метод должен вывести на экран переданную строку 3 раза. Каждый раз с новой строки.
 */

package level_02;

public class task0218 {
    public static void print3(String s) {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
    public static void main(String[] args) {
        print3("I love you!");
    }
}
