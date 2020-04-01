package by.itstep.goryachev.zachot;

import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    Comics thisnewcomics = new Comics();
    ArrayList<Comics> comicsArrayList = new ArrayList<>();
    private static boolean repeat = true;
    private static Scanner sc = new Scanner(System.in);

    public void infiniteMenu() throws IOException, ClassNotFoundException {
        while (repeat) {
            firstMenu();
        }

    }

    private void firstMenu() throws IOException, ClassNotFoundException {
        System.out.println("1. Добавить комикс \n" +
                "2. Удалить комикс \n" +
                "3. Редактировать комикс \n" +
                "4. Продать комикс \n" +
                "5. Списать комикс \n" +
                "6. Внести в акцию \n" +
                "7. Забронировать комикс \n" +
                "8. Найти комикс \n" +
                "9. Выход из меню");
        switch (sc.next()) {
            case "1":
                while (repeat) {
                    comicsmenu();
                    comicscreator();
                }
                System.out.println();
                repeat = true;
                break;
            case "2":
                comicsArrayList.remove(thisnewcomics);
                ObjectOutputStream listcomics = new ObjectOutputStream(new FileOutputStream("Comics.txt"));
                listcomics.writeObject(comicsArrayList);
                listcomics.flush();
                listcomics.close();
                break;
            case "3":
                comicsmenu();
                comicscreator();
                break;
            case "4":
                comicsArrayList.remove(thisnewcomics);
                ObjectOutputStream sales = new ObjectOutputStream(new FileOutputStream("Comics.txt"));
                sales.writeObject(comicsArrayList);
                sales.flush();
                sales.close();
                System.out.println("Комикс продан");
                break;
            case "5":
                comicsArrayList.remove(thisnewcomics);
                ObjectOutputStream debited = new ObjectOutputStream(new FileOutputStream("Comics.txt"));
                debited.writeObject(comicsArrayList);
                debited.flush();
                debited.close();
                System.out.println("Комикс списан");
                break;
            case "6":
                ArrayList<Comics> comicswithsale = new ArrayList<>();
                comicswithsale.add(thisnewcomics);
                ObjectOutputStream forsale = new ObjectOutputStream(new FileOutputStream("Comics.txt"));
                forsale.writeObject(comicsArrayList);
                forsale.flush();
                forsale.close();
                System.out.println("Теперь на этот комикс скидка");
                break;
            case "7":
                ArrayList<Comics> comicsholded = new ArrayList<>();
                comicsholded.add(thisnewcomics);
                ObjectOutputStream forholded = new ObjectOutputStream(new FileOutputStream("Comics.txt"));
                forholded.writeObject(comicsArrayList);
                forholded.flush();
                forholded.close();
                System.out.println("Теперь на этот комикс скидка");
                break;
            case "8":
                while (repeat) {
                    searchingmenu();
                    searching();
                }
                System.out.println();
                repeat = true;
                break;
            case "9":
                repeat = false;
                break;
            default:
                firstMenu();
                break;
        }
    }

    public void comicscreator() throws IOException {
        switch (sc.next()) {

            case ("1"):
                System.out.println("Введите название комикса");
                String name = sc.next();
                thisnewcomics.setName(name);
                System.out.println("Название комикса записано \n" +
                        "Что хотите записать дальше?");
                break;


            case ("2"):
                System.out.println("Введите автора:");
                String autorname = sc.next();
                thisnewcomics.setAutorname(autorname);
                System.out.println("Автор записан \n" +
                        "Что хотите записать дальше?");
                break;


            case ("3"):
                System.out.println("Введите издателя:");
                String publishing = sc.next();
                thisnewcomics.setPublishing(publishing);
                System.out.println("Издатель записан \n" +
                        "Что хотите записать дальше?");
                break;

            case ("4"):
                System.out.println("Введите количество страниц:");
                int page = Integer.parseInt(sc.next());
                thisnewcomics.setPage(page);
                System.out.println("Количество страниц записано \n" +
                        "Что хотите записать дальше?");
                break;

            case ("5"):
                System.out.println("Введите жанр");
                String genre = sc.next();
                thisnewcomics.setGenre(genre);
                System.out.println("Жанр записан \n" +
                        "Что хотите записать дальше?");
                break;
            case ("6"):
                System.out.println("Введите дату издания");
                int ageofpublishing = Integer.parseInt(sc.next());
                thisnewcomics.setAgeofpublishing(ageofpublishing);
                System.out.println("Дата издания записана \n" +
                        "Что хотите записать дальше?");
                break;
            case ("7"):
                System.out.println("Укажите себестоимость");
                int costprice = Integer.parseInt(sc.next());
                thisnewcomics.setCostprice(costprice);
                System.out.println("Себестоимость указана \n" +
                        "Что хотите записать дальше?");
                break;
            case ("8"):
                System.out.println("Укажите цену");
                int price = Integer.parseInt(sc.next());
                thisnewcomics.setPrice(price);
                System.out.println("Цена указана \n" +
                        "Что хотите записать дальше?");
                break;
            case ("9"):
                System.out.println("Укажите является ли комикс продолжением");
                System.out.println("Если да нажмите 1 - Если нет нажмите 2");
                int tobecontinue = Integer.parseInt(sc.next());
                if (tobecontinue == 1) {
                    thisnewcomics.setTobecontinue(true);
                } else if (tobecontinue == 2) {
                    thisnewcomics.setTobecontinue(false);
                }
                System.out.println("Данные записаны \n" +
                        "Что хотите записать дальше?");
                break;
            case ("0"):
                comicsArrayList.add(thisnewcomics);
                ObjectOutputStream listcomics = new ObjectOutputStream(new FileOutputStream("Comics.txt"));
                listcomics.writeObject(comicsArrayList);
                listcomics.flush();
                listcomics.close();
                repeat = false;
                break;
            default:
                System.out.println("Нужно вводить цифры от 1 до 9");
                System.out.println();
                break;
        }
    }

    public void comicsmenu() {
        System.out.println("Заполните данные о комиксе");
        System.out.println("1. Название комикса.\n" +
                "2. Автор.\n" +
                "3. Издатель.\n" +
                "4. Количество страниц.\n" +
                "5. Жанр.\n" +
                "6. Дата издания.\n" +
                "7. Себестоимость.\n" +
                "8. Цена.\n" +
                "9. Является ли комикс продолжением.\n" +
                "0. Сохранить и выйти.");
    }

    public void searchingmenu(){
        System.out.println("Найти комикс по:");
        System.out.println("1. Названию\n" +
                "2. Автору\n" +
                "3. Жанру \n" +
                "4. Выйти из меню поиска");
    }

    public void searching() throws NullPointerException{
        switch (sc.next()) {

            case ("1"):
                System.out.println("Введите название комикса");
                String name = sc.next();
                if (thisnewcomics.getName().startsWith(name)) {
                    System.out.println("Найден комикс " + thisnewcomics.getName());
                } else {
                    System.out.println("Ничего не найдено");
                }
                break;


            case ("2"):
                System.out.println("Введите автора");
                String autorname = sc.next();
                if (thisnewcomics.getAutorname().startsWith(autorname)) {
                    System.out.println("Найден комикс " + thisnewcomics.getName());
                } else {
                    System.out.println("Ничего не найдено");
                }
                break;


            case ("3"):
                System.out.println("Введите жанр");
                String genre = sc.next();
                if (thisnewcomics.getGenre().startsWith(genre)) {
                    System.out.println("Найден комикс " + thisnewcomics.getName());
                } else {
                    System.out.println("Ничего не найдено");
                }
                break;
            case ("4"):
                repeat = false;
                break;
            default:
                System.out.println("Нужно вводить цифры от 1 до 3");
                System.out.println();
                break;
        }
    }
}
