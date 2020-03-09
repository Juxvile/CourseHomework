package by.itstep.goryachev.filehomework;

import java.util.Scanner;

public class Doing {
    public static void thismenu () {
        User user = new User();
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        int act2 = sc.nextInt();
        switch (act2) {
            case (1):
                System.out.println("Имя контакта:");
                String name = sc.next();
                user.setName(name);
                System.out.println("Имя контакта записано успешно \n" +
                        "Что хотите записать дальше?");
                break;


            case (2):
                System.out.println("Фамилия контакта:");
                String surname = sc.next();
                user.setSurname(surname);
                System.out.println("Имя контакта записано успешно \n" +
                        "Что хотите записать дальше?");
                break;


            case (3):
                System.out.println("Прозвище контакта:");
                String nickname = sc.next();
                user.setNickname(nickname);
                System.out.println("Прозвище контакта записано успешно \n" +
                        "Что хотите записать дальше?");
                break;

            case (4):
                System.out.println("Домашний номер:");
                int homenumber = sc.nextInt();
                user.setHomenumber(homenumber);
                System.out.println("Домашний номер записан успешно \n" +
                        "Что хотите записать дальше?");
                break;

            case (5):
                System.out.println("Рабочий номер:");
                int jobnumber = sc.nextInt();
                user.setJobnumber(jobnumber);
                System.out.println("Рабочий номер записан успешно \n" +
                        "Что хотите записать дальше?");
                break;
            case (6):
                System.out.println("Мобильный номер:");
                int mobilenumber = sc.nextInt();
                user.setMobilenumber(mobilenumber);
                System.out.println("Мобильный номер записан успешно \n" +
                        "Что хотите записать дальше?");
                break;
            case (7):
                System.out.println("Факс:");
                int fax = sc.nextInt();
                user.setFax(fax);
                System.out.println("Факс записан успешно \n" +
                        "Что хотите записать дальше?");
                break;
            case (8):
                System.out.println("Введите email:");
                String email = sc.next();
                user.setEmail(email);
                System.out.println("Email записан успешно \n" +
                        "Что хотите записать дальше?");
                break;
            case (9):
                System.out.println("Введите email:");
                int age = sc.nextInt();
                user.setAge(age);
                System.out.println("Год рождения записан успешно \n" +
                        "Что хотите записать дальше?");
                break;
            default:
                System.out.println("Нужно вводить цифры от 1 до 9");
                System.out.println();
                break;
        }
        menu.content();
    }
}
