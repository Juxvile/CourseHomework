package by.itstep.goryachev.homework5;


public class Numb1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int result;
        while (true) {
            result = a + b;
            if (result >= 10000000) {
                break;
            }
            a = b;
            b = result;
            System.out.println(result);
        }
    }
}
