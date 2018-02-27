/*
Программист создает человека
Создать class Person. У человека должно быть имя String name, возраст int age.
Добавь метод initialize(String name, int age), в котором проинициализируй переменные name и age.
В методе main создай объект Person, занеси его ссылку в переменную person.
Вызови метод initialize с любыми значениями.
 */
package level_05;

public class task0514 {
    public static void main (String []args){
        Person person = new Person();
        person.initialize("Vasia", 25);
    }

    // class Person should be static to be referenced
    // from a static method: main
    static class Person{
        private String name;
        private int age;

        public void initialize(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
}
