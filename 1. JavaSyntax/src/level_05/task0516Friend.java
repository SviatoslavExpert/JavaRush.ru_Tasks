/*
Друзей не купишь
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
 */

package level_05;

public class task0516Friend {
    private String name;
    private int age;
    private char sex;

    public task0516Friend(String name){
        this.name = name;
    }

    public task0516Friend(String name, int age){
        this.name = name;
        this.age = age;
    }

    public task0516Friend(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main (String []args){
    }
}
