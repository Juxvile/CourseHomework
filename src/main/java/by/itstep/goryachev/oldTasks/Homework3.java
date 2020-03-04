package by.itstep.goryachev.oldTasks;


import com.sun.org.apache.xpath.internal.SourceTree;

public class Homework3 {
    public static void main(String[] args) {
        int d = 9;
        System.out.println("Список животных");
        System.out.println("1 - Кошка");
        System.out.println("2 - Собака");
        System.out.println("3 - Корова");
        System.out.println("4 - Курица");
        System.out.println("5 - Змея");
        System.out.println("6 - Свинья");
        System.out.println("7 - Коза");
        System.out.println("8 - Баран");
        System.out.println("9 - Лошадь");
        System.out.println("10 - Воробей");

        switch (d) {
            case 1:
                System.out.println("Мяу");
                break;
            case 2:
                System.out.println("Гав");
                break;
            case 3:
                System.out.println("Муу");
                break;
            case 4:
                System.out.println("Ко-ко");
                break;
            case 5:
                System.out.println("Шшшшш");
                break;
            case 6:
                System.out.println("Хрю-хрю");
                break;
            case 7:
                System.out.println("Мееее");
                break;
            case 8:
                System.out.println("Бееее");
                break;
            case 9:
                System.out.println("Иго-го");
                break;
            case 10:
                System.out.println("Чик-чирик");
                break;
            default:
                System.out.println("Список закончился");
                break;
        }
    }
}
