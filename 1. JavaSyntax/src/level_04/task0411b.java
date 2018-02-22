/*
Времена года на Терре
Реализовать метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
Пример для номера месяца 2:
зима
Пример для номера месяца 5:
весна
 */

package level_04;

public class task0411b {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }
    public static void checkSeason(int month) {
        //напишите тут ваш код
        if (month >= 1 && month <= 2 || month == 12){
            System.out.println("зима");
        }
        if (month >= 3 && month <= 5){
            System.out.println("весна");
        }
        if (month >= 6 && month <= 8){
            System.out.println("лето");
        }
        if (month >= 9 && month <= 11){
            System.out.println("осень");
        }
    }
}
