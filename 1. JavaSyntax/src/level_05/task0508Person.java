/*
Геттеры и сеттеры для класса Person
Создать class Person. У человека должно быть имя String name, возраст int age, пол char sex.
Создайте геттеры и сеттеры для всех переменных класса Person.
*/
package level_05;

public class task0508Person {
    public String name;
    public int age;
    public char sex;

    public static void main(String[] args) {
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSex(char sex){
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public char getSex(){
        return sex;
    }
}
