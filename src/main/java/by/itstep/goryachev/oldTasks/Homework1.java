package by.itstep.goryachev.oldTasks;

        import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Введите день недели");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторик");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("В неделе всего 7 дней");
                break;
        }
    }
}
