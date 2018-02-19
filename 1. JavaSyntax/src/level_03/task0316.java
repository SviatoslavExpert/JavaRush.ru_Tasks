/*
Экранирование символов
Про экранирование символов в Java читай в дополнительном материале к лекции.
Вывести на экран следующий текст - две строки:
It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
 */

package level_03;

public class task0316 {
    public static void main(String[] args) {
        System.out.println("It's Windows path: " + "\"" + "C:" + "\\" + "Program Files" + "\\" + "Java" + "\\" + "jdk1.7.0" + "\\" + "bin" + "\"");
        System.out.println("It's Java string: " + "\\" + "\"" + "C:" + "\\" + "\\" + "Program Files" + "\\" + "\\" + "Java" +
                "\\" + "\\" + "jdk1.7.0" + "\\" + "\\" + "bin" + "\\" + "\"");
    }
}
