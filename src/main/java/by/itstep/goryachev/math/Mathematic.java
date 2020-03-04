package by.itstep.goryachev.math;


import java.util.Arrays;

public class Mathematic {
    public static void main(String[] args) {
        int [] arr = new int [10];
        for (int i = 0; i < 10; i++) {
            arr [i] = (int) ((Math.random() * 101) - 50);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
