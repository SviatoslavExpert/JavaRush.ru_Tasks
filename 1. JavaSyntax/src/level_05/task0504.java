/*
Трикотаж
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
 */

package level_05;

public class task0504 {

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat ("Tom",2,3,11);
        Cat cat2 = new Cat ("Mura",1,4,12);
        Cat cat3 = new Cat ("Fluffy",3,3,5);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
