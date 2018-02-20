/*
Реализовать метод setName
Реализовать метод setName, чтобы с его помощью можно
было устанавливать значение переменной private String name
равное переданному параметру String name.
 */

package level_04;

public class task0403Cat {
        private String name;
        public void setName(String name) {
            //напишите тут ваш код
            this.name = name;
        }
        public static void main(String[] args) {
            task0403Cat cat = new task0403Cat();
            cat.setName("Vasya");
        }
}
