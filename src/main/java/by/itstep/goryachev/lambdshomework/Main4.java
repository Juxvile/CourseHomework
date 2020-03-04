package by.itstep.goryachev.lambdshomework;


//Создайте и вызовите следующие лямбда-выражения.
//        Обязательно использовать лямбду, как параметр метода.
//        Метод находит сумму элементов массива, которые
//        соответствуют условию лямбда-выражения. Варианты
//        лямбда-выражений:
//        1 Проверка на четность;
//        2 Проверка на нечетность;
//        3 Число находится в диапазоне от A до B;
//        4 Проверка на кратность параметру A.


public class Main4 {
    public static void main(String[] args) {
//        System.out.println("Введите параметр кратности");
//        Scanner sc = new Scanner(System.in);
//        int crat = sc.nextInt();
//        ArrayLambds number = (int a, int b, int c, int d, int f) -> {
//            if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0 && d % 2 == 0 && f % 2 == 0) {
//                return a + b + c + d + f;
//            } else {
//                return -1;
//            }
//        };
//        System.out.println(number.number(1,2,3,4,5));
//        ArrayLambds number1 = (int a, int b, int c, int d, int f) -> {
//            if (a % 2 != 0 && b % 2 != 0 && c % 2 != 0 && d % 2 != 0 && f % 2 != 0) {
//                return a + b + c + d + f;
//            } else {
//                return -1;
//            }
//        };
//        System.out.println(number1.number(1,3,5,7,9));
//        ArrayLambds number2 = (int a, int b, int c, int d, int f) -> {
//            if (a > 10 && a < 100 && b > 10 && b < 100 && c > 10 && c < 100 && d > 10 && d < 100 && f > 10 && f < 100) {
//                return a + b + c + d + f;
//            } else {
//                return -1;
//            }
//        };
//        System.out.println(number2.number(56,34,21,76,98));
//        ArrayLambds number3 = (int a, int b, int c, int d, int f) -> {
//            if (a % crat == 0 && b % crat == 0 && c % crat == 0 && d % crat == 0 && f % crat == 0) {
//                return a + b + c + d + f;
//            } else {
//                return -1;
//            }
//        };
//        System.out.println(number3.number(56,34,21,76,98));
        Express even = (n)-> n % 2 == 0;
        Express uneven = (n) -> n % 2 != 0;
//        Diapason diap = (n) -> n <
        int [] arr = new int[15];
        arr[0] = (int)(Math.random() * 100);
        for (int i = 1; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100);
        }
        System.out.println(sumeven(arr, even));
        System.out.println(sumuneven(arr, uneven));
    }
    private static int sumeven (int[] arr, Express even) {
        int result = 0;
        for (int j : arr) {
            if (even.isEqual(j))
                result += j;
        }
        return result;
    }
    private static int sumuneven (int[] arr, Express uneven) {
        int result = 0;
        for (int j : arr) {
            if (uneven.isEqual(j))
                result += j;
        }
        return result;
    }
    private static int sumdiap (int[] arr, Diapason diap) {
        int result = 0;
        for (int j : arr) {
//            if (diap.isEqual(j,))
                result += j;
        }
        return result;
    }
}
