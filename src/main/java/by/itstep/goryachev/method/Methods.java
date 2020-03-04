package by.itstep.goryachev.method;


import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
//        int [] arr = {2, 4, 6, 8};
//        sayHello();
//        sayHello("Mark");
//        sayHello("Andrey");
//        sayHello(8);
//        sayHello(arr);
//    }
//    модификаторДоступа static типВозвращаемогоЗначения methodName(arguments) {}
//    public static void sayHello () {
//        System.out.println("Hi boys");
//    }
//    public static void sayHello (String name) {
//        System.out.println("Hi " + name);
//    }
//    public static void sayHello (int a) {
//        System.out.println(a);
//    }
//    public static void sayHello (int [] arr) {
//        System.out.println(Arrays.toString(arr));
//        System.out.println(fact(6));
        int b = 5;
        int i = 1;
        while (i <= b) ;
        {
            System.out.print(fibonachi(i) + " ");
            i++;
        }
    }
//    public static int fact (int a) {
//        if (a == 1 || a == 0) {
//            return 1;
//        }
//        else if (a == 2) {
//            return 2;
//        } else {
//            return fact(a-1) * a;
//        }
//    }
    public static int fibonachi (int n) {
        if (n <=1 )  {
            return n;
        } else {
            return fibonachi((n - 2) + fibonachi(n - 1));
        }
    }
}
