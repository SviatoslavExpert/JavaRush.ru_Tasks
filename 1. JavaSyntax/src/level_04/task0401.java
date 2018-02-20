/*
Мне не подходит этот возраст…
Подумайте, что делает программа.
Исправьте ошибку в программе чтобы переменная age объекта person изменила свое значение.
Подсказка: тщательно просмотрите метод adjustAge
 */
//   to think


package level_04;

public class task0401 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted Age is: " + person.age);
    }
    public static class Person {
        public int age = 20;
        public void adjustAge(int age) {
            this.age = age + 20;
            System.out.println("The Age in adjustAge() is " + this.age);
        }
    }
}
