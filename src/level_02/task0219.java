/*
Печатаем трижды
Реализуй метод print3. Метод должен вывести переданную строку (слово) на экран три раза, но в одной строке.
Слова должны быть разделены пробелом и не должны сливаться в одно.
 */

package level_02;

public class task0219 {
    public static void print3(String s)
    {
        System.out.println(s + " " + s + " " + s);
    }
    public static void main(String[] args)
    {
        print3("window");
        print3(" file");
    }
}
