package by.itstep.goryachev.homework4;


import java.util.Scanner;

public class Numb4 {
    public static void main(String[] args) {
        System.out.println("Введите строку из слов");
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" |:");
        for (String newStr : str) {
            if (newStr.startsWith("a") || newStr.startsWith("i") || newStr.startsWith("o") || newStr.startsWith("u") || newStr.startsWith("y") || newStr.startsWith("e")) {
                if (!newStr.endsWith("a") && !newStr.endsWith("i") && !newStr.endsWith("o") && !newStr.endsWith("u") && !newStr.endsWith("y") && !newStr.endsWith("e")) {
                    System.out.println(newStr);
                }
            }
        }
    }
}

