package by.itstep.goryachev.lambdshomework;

//Создайте и вызовите следующие лямбда-выражения.
//        Обязательно использовать шаблоны:
//        1 Максимум из трёх;
//        2 Минимум из трёх.

public class Main3 {
    public static void main(String[] args) {
        MaxThree min = (int a, int b,int c) -> {
            if (a < b && a < c) {
                return a;
            } else if (b < a && b < c) {
                return b;
            } else {
                return c;
            }
        };
        System.out.println(min.minmax(5,3,2));
        MaxThree max = (int a, int b,int c) -> {
            if (a > b && a > c) {
                return a;
            } else if (b > a && b > c) {
                return b;
            } else {
                return c;
            }
        };
        System.out.println(max.minmax(5,3,2));
    }
}
