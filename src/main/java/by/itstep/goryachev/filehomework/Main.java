package by.itstep.goryachev.filehomework;

//Написать программу – телефонная книга.
//        Программа должна иметь возможность создавать и сохранять новые контакты. Просматривать ранее сохраненные
//        имена. Искать контакт по номеру телефона или по имени.
//        Контакт может включать в себя:
//        ■ имя;
//        ■ фамилия;
//        ■ прозвище;
//        ■ номера телефонов (неограниченное количество, может
//        быть несколько с одинаковым типом). Номера телефонов
//        не должны повторяться для разных контактов.
//        » домашний;
//        » рабочий;
//        » мобильный;
//        » факс.
//        ■ электронные адреса (проверка на корректность);
//        ■ год рождения.

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean rl = true;
        Menu menu = new Menu();
        menu.contact();
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Чтобы создать контакт надо ввести 1");
            sc.nextLine();
        }
        int act1 = sc.nextInt();
        if (act1 == 1) {
            menu.content();
        } else {
            System.out.println("Чтобы создать контакт надо ввести 1");
        }
        while (rl = true) {
            Doing.thismenu();
        }
    }
}


