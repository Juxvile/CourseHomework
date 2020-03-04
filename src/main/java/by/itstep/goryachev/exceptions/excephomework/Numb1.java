package by.itstep.goryachev.exceptions.excephomework;


import java.util.Scanner;

public class Numb1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr [i] = ((int) (Math.random() * 20) - 10);
            try {
                System.out.println(i / a);
            }
            catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
//            System.out.println(arr[i]);
        }
    }
}
