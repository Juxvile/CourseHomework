package by.itstep.goryachev.massiv;


import java.util.Arrays;

public class Numb1 {
    public static void main(String[] args) {
        int [] arr = new int[15];
        for (int i = 2; i < arr.length; i++) {
            arr[0] = 0;
            arr[1] = 1;
            arr[i] = arr[i-1] + arr[i - 2];
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
