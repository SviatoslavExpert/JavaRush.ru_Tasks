/*
Реализовать метод setName
Реализовать метод setName, чтобы с его помощью можно было
устанавливать значение переменной private String fullName
равное значению локальной переменной String fullName.
 */

package level_04;

public class task0406Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        //напишите тут ваш код
        this.fullName = fullName;
    }
    public static void main(String[] args) {
    }
}
