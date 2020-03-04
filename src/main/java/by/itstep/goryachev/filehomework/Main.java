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
        User user = new User();
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
        int act2 = sc.nextInt();
            switch (act2) {
                case (1):
                    System.out.println("Имя контакта:");
                    String name = sc.next();
                    user.setName(name);
                    System.out.println("Имя контакта записано успешно \n" +
                            "Что хотите записать дальше?");
                    menu.content();
                    break;


                case (2):
                    System.out.println("Фамилия контакта:");
                    String surname = sc.next();
                    user.setSurname(surname);
                    System.out.println("Имя контакта записано успешно \n" +
                            "Что хотите записать дальше?");
                    menu.content();
                    break;


                case (3):
                    System.out.println("Прозвище контакта:");
                    String nickname = sc.next();
                    user.setNickname(nickname);
                    System.out.println("Прозвище контакта записано успешно \n" +
                            "Что хотите записать дальше?");
                    menu.content();
                    break;

                case (4):
                    System.out.println("Домашний номер:");
                    int homenumber = sc.nextInt();
                    user.setHomenumber(homenumber);
                    System.out.println("Домашний номер записан успешно \n" +
                            "Что хотите записать дальше?");
                    menu.content();
                    break;

                case (5):
                    System.out.println("Рабочий номер:");
                    int jobnumber = sc.nextInt();
                    user.setJobnumber(jobnumber);
                    System.out.println("Рабочий номер записан успешно \n" +
                            "Что хотите записать дальше?");
                    menu.content();
                    break;
                case (6):
                    System.out.println("Мобильный номер:");
                    int mobilenumber = sc.nextInt();
                    user.setMobilenumber(mobilenumber);
                    System.out.println("Мобильный номер записан успешно \n" +
                            "Что хотите записать дальше?");
                    menu.content();
                    break;
                case (7):
                    System.out.println("Факс:");
                    int fax = sc.nextInt();
                    user.setFax(fax);
                    System.out.println("Факс записан успешно \n" +
                            "Что хотите записать дальше?");
                    menu.content();
                    break;
                case (8):
                    System.out.println("Введите email:");
                    String email = sc.next();
                    user.setEmail(email);
                    System.out.println("Email записан успешно \n" +
                            "Что хотите записать дальше?");
                    menu.content();
                    break;
                case (9):
                    System.out.println("Введите email:");
                    int age = sc.nextInt();
                    user.setAge(age);
                    System.out.println("Год рождения записан успешно \n" +
                            "Что хотите записать дальше?");
                    menu.content();
                    break;

        }
    }
}


