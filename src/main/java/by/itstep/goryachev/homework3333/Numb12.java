package by.itstep.goryachev.homework3333;

import java.util.Scanner;

public class Numb12 {
    public static void main(String[] args) {
        System.out.println("Сколько км всего пробежал спортсмен");
        Scanner sc = new Scanner(System.in);
        double y = sc.nextInt();
        System.out.println("Сколько км пробежал спортсмен в первый день");
        Scanner qw = new Scanner(System.in);
        double x = qw.nextInt();
        while (x < y) {
            double d = x * 1.1;
            double q = d;
            System.out.println(" " + y + " " + x);
        }
    }
}
