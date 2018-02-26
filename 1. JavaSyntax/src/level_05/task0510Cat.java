/*
Кошкоинициация
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
 */
package level_05;

public class task0510Cat {
    public String name = null;
    public double weight;
    public int age;
    public String color;
    public String address = null;

    public static void main(String[] args) {
    }

    public void initialize(String name) {
        this.name = name;
        weight = 3;
        age = 7;
        color = "red";
    }
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "red";
    }
    public void initialize(String name, int age) {
        this.name = name;
        this.weight = 3;
        this.age = age;
        color = "red";
    }
    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 7;
    }
    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.age = 7;
        this.address = address;
    }
}
