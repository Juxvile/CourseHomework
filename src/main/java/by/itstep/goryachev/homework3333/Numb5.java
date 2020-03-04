package by.homework3;

import java.util.Scanner;

public class Numb5 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        StringBuilder reverser = new StringBuilder();
        reverser.append(number);
        reverser.reverse();
        String reversed = reverser.toString();
        int numb;
        numb = Integer.parseInt(reversed);
        if (number == numb) {
            System.out.println("YES");
        } else {
                System.out.println("NO");
        }
    }
}
