/*
Инициализация объектов
Изучи внимательно класс Person.
Исправь класс так, чтобы только один метод initialize
инициализировал все переменные класса Person.
 */
package level_05;

public class task0515Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;

    public void initialize(String name, int money, char sex, int weight, double size) {
        this.name = name;
        this.money = money;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
    }

    public static void main(String[] args) {

    }
}