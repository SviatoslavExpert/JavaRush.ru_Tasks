/*
Треугольник из восьмерок
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
 */
package level_04;

public class task0437 {
    public static void main (String []args) throws Exception {
        for (int i = 1; i < 11; i++){
            for (int j = 0; j < i; j++){
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
