/*
Реализовать метод addNewCat
Реализовать метод addNewCat, чтобы при его вызове
(т.е. добавлении нового кота), количество котов увеличивалось на 1.
За количество котов отвечает переменная catsCount.
 */

package level_04;

public class task0404Cat {
    private static int catsCount = 0;
    public static void addNewCat() {
        //напишите тут ваш код
        task0404Cat.catsCount++;
    }
    public static void main(String[] args) {
    }
}
