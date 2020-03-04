package by.itstep.goryachev.homework3333;

public class Numb4 {
    public static void main(String[] args) {
        int i;
        int j;
        int sum = 0;
        for (i = 5; i <= 1000000; i++) {
            for (j = 1; j <= (i / 2); j++) {
                if (i % j == 0) {
                    sum = sum + j;}
                if (sum == i)
                    System.out.println(i + " Perfect");

            }
        }
    }
}