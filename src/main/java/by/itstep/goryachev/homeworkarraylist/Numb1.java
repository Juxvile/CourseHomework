package by.itstep.goryachev.homeworkarraylist;


import java.util.ArrayList;
import java.util.Scanner;

public class Numb1  {
    public static void main(String[] args) {
        System.out.println("Введите несколько чисел");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int f = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.add(d);
        numbers.add(f);

        Menu menu = new Menu();
        Action action = new Action();
        menu.scanner();
//        action.actions();

    }
}
