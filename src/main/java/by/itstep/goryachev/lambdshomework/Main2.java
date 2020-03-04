package by.itstep.goryachev.lambdshomework;

//Создайте и вызовите следующие лямбда-выражения:
//        1 Максимум из двух;
//        2 Минимум из двух;
//        3 Факториал числа;
//        4 Проверка простое число или нет.


public class Main2 {
    public static void main(String[] args) {
        Inter2 maximum = (int x, int y) -> Math.max(x,y);
        System.out.println(maximum.two(5,7));
        Inter2 minimum = (int x, int y) -> Math.min(x,y);
        System.out.println(minimum.two(2,9));
        InterFac factorial = (int x) -> {
            int result = 1;
            for (int i = 1; i <= x; i++) {
                result = result * i;
            }
            return result;
        };
        System.out.println(factorial.factorial(8));
        InterSimple simple = (int x) -> {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    System.out.println("Число не простое");
                    break;
                } else {
                    System.out.println("Число простое");
                    break;
                }
            }
            return x;
        };
        System.out.println(simple.simple(3));
    }
}

