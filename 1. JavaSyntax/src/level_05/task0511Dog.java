/*
Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
 */
package level_05;

public class task0511Dog {
    public String name = null;
    public int height = 33;
    public String color = "white";

    public void initialize(String name) {
        this.name = name;
    }
    public void initialize(String name, int height){
        this.name = name;
        this.height = height;
    }
    public void initialize(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
