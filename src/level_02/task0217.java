package level_02;

public class task0217 {

        public static int min(int a, int b, int c, int d) {
            //напишите тут ваш код
            if (min (a,b) <= min(c,d))
                return min(a,b);
            else
                return min(c,d);
        }
        public static int min(int x, int y) {
            //напишите тут ваш код
            if (x <= y)
                return x;
            else
                return y;
        }
        public static void main(String[] args) throws Exception {
            System.out.println(min(-20, -10));
            System.out.println(min(-20, -10, -30, -40));
            System.out.println(min(-20, -10, -30, 40));
        }
}
