/*
Геттеры и сеттеры для класса Dog
Создать class Dog.
У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
 */

package level_05;

public class task0503Dog {
    public String name;
    public int age;

    public static void main(String[] args) {
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
