package by.itstep.goryachev.homework3;


public class Numb1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int result;
        while (true) {
        result = a+b;
        if (result >=10000000) {
            break;
        }
            System.out.println(result);
        a = b;
        b = result;
        }
    }
}
