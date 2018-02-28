/*
Регистрируем собачек
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
 */

package level_05;

public class task0518Dog {
    private String name;
    private int height;
    private String color;

    public task0518Dog (String name){
        this.name = name;
    }
    public task0518Dog (String name, int height) {
        this.name = name;
        this.height = height;
    }
    public task0518Dog (String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main (String []args){

    }
}
