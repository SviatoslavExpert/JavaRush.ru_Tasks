/*
Печатаем строки
Реализуй метод public static void writeToConsole(String s),
который добавляет к началу строки выражение "printing: "
и выводит измененную строку на экран.
Пример вывода для "Hello world!":
printing: Hello world!
 */

package level_03;

public class task0311 {

    public static void main(String[] args) {
        writeToConsole("Hello world!");
    }
    public static void writeToConsole(String s) {
        System.out.print("printing: " + s);
    }
}
