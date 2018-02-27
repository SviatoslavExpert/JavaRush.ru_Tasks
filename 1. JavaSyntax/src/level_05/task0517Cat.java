/*
Конструируем котиков
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)
Задача конструктора – сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
 */
package level_05;

public class task0517Cat {
    private String name = null;
    private int weight;
    private int age;
    private String color;
    private String address = null;

    public task0517Cat(String name){
        this.name = name;
        this.weight = 3;
        this.age = 3;
        this.color = "white";
    }
    public task0517Cat(String name, int weight, int age){
        this.name = name;
        this.weight= weight;
        this.age = age;
        this.color = "white";
    }
    public task0517Cat(String name, int age){
        this.name = name;
        this.weight= 3;
        this.age = age;
    }
    public task0517Cat(int weight, String color){
        this.weight= weight;
        this.age = 3;
        this.color = color;
    }
    public task0517Cat(int weight, String color, String address){
        this.weight= weight;
        this.age = 3;
        this.color = color;
        this.address = address;
    }

    public static void main (String []args){

    }
}
