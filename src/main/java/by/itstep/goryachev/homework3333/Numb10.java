package by.itstep.goryachev.homework3333;

public class Numb10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            for (int j = i + 1; j < 1000000; j++) {
                if (j % i == 0) {
                    System.out.println(j);
                }
            }
        }
    }
}
