package by.itstep.goryachev.method;


public class MethodsTwo {
    public static void main(String[] args) {
        int c = sum(99,173);
        System.out.println(c);
        System.out.println(sum(12,35,78));
    }
    public static int sum (int a, int b) {
//        int sum = a + b;
//        return sum;
        return a + b;
    }
    public static int sum (int a, int b, int c) {
//        int sum = a + b;
//        return sum;
        return a + b + c;
    }
}
