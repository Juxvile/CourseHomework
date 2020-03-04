package by.homework3;

import java.util.Scanner;

public class Numb12 {
    public static void main(String[] args) {
        System.out.println("Сколько км всего пробежал спортсмен");
        Scanner sc = new Scanner(System.in);
        double y = sc.nextInt();
        System.out.println("Сколько км пробежал спортсмен в первый день");
        Scanner qw = new Scanner(System.in);
        double x = qw.nextInt();
        double d = (x / 100) * 10;
        double j;
        j = x + d;
        for ( ; j < y; j += d)
            System.out.println(j);

    }
}
