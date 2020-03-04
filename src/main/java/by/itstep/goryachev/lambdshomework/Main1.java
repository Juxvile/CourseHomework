package by.itstep.goryachev.lambdshomework;

import by.itstep.goryachev.threadhomework.Sum;

import java.time.LocalDate;
import java.time.LocalTime;


//Создайте и вызовите следующие лямбда-выражения:
//        1 Подсчет суммы трёх целых чисел;
//        2 Подсчет произведения трёх целых чисел;
//        3 Вывод текущего времени;
//        4 Вывод текущей даты.


public class Main1{
    public static void main(String[] args) {
        Inter three = (int x, int y, int q) -> x + y + q;
        System.out.println(three.three(5,4,3));
        Inter three1 = (int x, int y, int q) -> x * y * q;
        System.out.println(three1.three(65,2,3));
        DateNow dat = str -> System.out.println(str);
        dat.printString(LocalTime.now());
        YearMonthDay year = str -> System.out.println(str);
        year.printString(LocalDate.now());


    }

}
