package by.itstep.goryachev.threadhomework;


import java.util.Scanner;

public class Main {
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
        MinArray minArray = new MinArray(arr);
        minArray.start();
        MaxArray maxArray = new MaxArray(arr);
        maxArray.start();
    }
}
