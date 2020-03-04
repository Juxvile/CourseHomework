package by.itstep.goryachev.homework4;

import java.util.Scanner;

public class Numb2 {
    public static void main(String[] args) {



        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        while (stringBuilder.length() <= 997){
            stringBuilder.append(count);
            ++count;
        }
        System.out.println(stringBuilder.toString());


        System.out.println("Введите номер цифры");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        System.out.println(stringBuilder.charAt(number - 1));

    }
}
