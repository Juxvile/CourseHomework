package by.homework3;

public class Numb9 {
    public static void main(String[] args) {
        int x;
        for (int i = 0; i <= 1000; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                x = (i * (i + 1) / 2);
                System.out.println(x);
            }
        }
    }
}
