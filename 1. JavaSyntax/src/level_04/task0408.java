/*
Хорошо или плохо?
Реализовать метод compare(int a). Метод должен выводить строку на экран "Число меньше 5", если параметр метода меньше 5,
выводить строку "Число больше 5", если параметр метода больше 5,
выводить строку "Число равно 5", если параметр метода равен 5.
 */

package level_04;

public class task0408 {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }
    public static void compare(int a) {
        if (a < 5) {
            System.out.println("Число меньше 5");
        } else if (a > 5) {
            System.out.println("Число больше 5");
        } else {
            System.out.println("Число равно 5");
        }
    }
}
