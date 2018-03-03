/*
Пустые кошки, пустые псы
В каждом классе Cat и Dog написать метод finalize,
который выводит на экран текст о том, что такой-то объект уничтожен.
 */
package level_06;

public class task0602Cat {
    public static void main(String[] args) {

    }

    //напишите тут ваш код
    protected void finalize() throws Throwable {
        System.out.print("Cat was destroyed");
    }

}

class Dog {
    //напишите тут ваш код
    protected void finalize() throws Throwable {
        System.out.print("Dog was destroyed");
    }
}