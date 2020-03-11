package by.itstep.goryachev.filehomework;

import java.io.IOException;

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

import java.io.*;
import java.util.Scanner;

public class Doing {
    private static boolean rl = true;
    private static Scanner sc = new Scanner(System.in);
    public static void infiniteMenu () throws IOException {
        while (rl) {
            firstMenu();
        }

    }
    private static void firstMenu() throws IOException {
        System.out.println("1. Создать контакт \n" +
                "2. Показать контакты \n" +
                "3. Поиск контакта \n" +
                "0. Выход из меню");
        switch (sc.next()){
            case "1":
                while (rl) {
                    content();
                    thisMenu();
                }
                System.out.println();
                rl = true;
                break;
            case "2":
                break;
            case "3":
                break;
            case "0":
                rl = false;
                break;
            default:
                firstMenu();
        }
    }
    public static void thisMenu () throws IOException {
        User user = new User();
        FileWriter contacts = new FileWriter("Users.txt");
        switch (sc.next()) {
            case ("1"):
                System.out.println("Имя контакта:");
                String name = sc.next();
                user.setName(name);
                contacts.write(name);
                System.out.println("Имя контакта записано успешно \n" +
                        "Что хотите записать дальше?");
                break;


            case ("2"):
                System.out.println("Фамилия контакта:");
                String surname = sc.next();
                user.setSurname(surname);
                System.out.println("Имя контакта записано успешно \n" +
                        "Что хотите записать дальше?");
                break;


            case ("3"):
                System.out.println("Прозвище контакта:");
                String nickname = sc.next();
                user.setNickname(nickname);
                System.out.println("Прозвище контакта записано успешно \n" +
                        "Что хотите записать дальше?");
                break;

            case ("4"):
                HouseNumber houseNumber = new HouseNumber();
                System.out.println("Домашний номер:");
                String housenumber = sc.next();
                houseNumber.setHousenumber(housenumber);
                System.out.println("Домашний номер записан успешно \n" +
                        "Что хотите записать дальше?");
                break;

            case ("5"):
                JobNumber jobNumber = new JobNumber();
                System.out.println("Рабочий номер:");
                String jobnumber = sc.next();
                jobNumber.setJobNumber(jobnumber);
                System.out.println("Рабочий номер записан успешно \n" +
                        "Что хотите записать дальше?");
                break;
            case ("6"):
                MobileNumber mobileNumber = new MobileNumber();
                System.out.println("Мобильный номер:");
                String mobilenumber = sc.next();
                mobileNumber.setMobileNumber(mobilenumber);
                System.out.println("Мобильный номер записан успешно \n" +
                        "Что хотите записать дальше?");
                break;
            case ("7"):
                Fax fax = new Fax();
                System.out.println("Факс:");
                String fax1 = sc.next();
                fax.setFax(fax1);
                System.out.println("Факс записан успешно \n" +
                        "Что хотите записать дальше?");
                break;
            case ("8"):
                System.out.println("Введите email:");
                String email = sc.next();
                user.setEmail(email);
                System.out.println("Email записан успешно \n" +
                        "Что хотите записать дальше?");
                break;
            case ("9"):
                System.out.println("Введите email:");
                int age = sc.nextInt();
                user.setAge(age);
                System.out.println("Год рождения записан успешно \n" +
                        "Что хотите записать дальше?");
                break;
            case ("0"):
                rl = false;
                break;
            default:
                System.out.println("Нужно вводить цифры от 1 до 9");
                System.out.println();
                break;
        }
    }

    public static void content() {
        System.out.println("Нажмите соответсвующие цифры для продолжения создания контакта");
        System.out.println("1. Ввести имя.\n" +
                "2. Ввести фамилию.\n" +
                "3. Ввести прозвище.\n" +
                "4. Ввести домашний номер.\n" +
                "5. Ввести рабочий номер.\n" +
                "6. Ввести мобильный номер.\n" +
                "7. Ввести факс.\n" +
                "8. Ввести email.\n" +
                "9. Ввести год рождения.\n" +
                "0. Выход в предыдущее меню.");
    }
}