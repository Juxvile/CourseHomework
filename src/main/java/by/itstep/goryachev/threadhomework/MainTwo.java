package by.itstep.goryachev.threadhomework;
//Пользователь с клавиатуры вводит значения в массив.
//После чего запускаются две потока. Первый поток находит сумму элементов в массиве. Второй поток находит
//среднеарифметическое в массиве. Результаты вычислений
//возвращаются в метод main.

import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        System.out.println("Введите массив целых чисел");
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            while (!sc.hasNextInt()){
                System.out.println("Введите целое число");
                sc.nextLine();
            }
            arr[i] = sc.nextInt();
        }
        Sum sum = new Sum(arr);
        sum.start();
        Average average = new Average(arr);
        average.start();

    }
}
