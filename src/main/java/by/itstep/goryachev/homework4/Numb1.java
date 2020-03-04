package by.itstep.goryachev.homework4;

import java.util.Scanner;
import java.util.regex.Matcher;

public class Numb1 {
    public static void main(String[] args) {
        System.out.println("Введите строку текста");
        Scanner sc = new Scanner(System.in);
        String strok = sc.next();
        System.out.println("Введите один символ");
        String simv = sc.next();
        int i =0;
        int count = 0;
        while(strok.indexOf(simv, i) != - 1){

            i = strok.indexOf(simv, i);
            System.out.println(i);
            i += 1;
            count ++;

        }
        System.out.println(count != 0 ? ("Всего совпадений" + count) : "Нет совпадений");

    }
}
