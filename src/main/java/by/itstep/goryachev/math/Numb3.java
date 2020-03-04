package by.itstep.goryachev.math;


public class Numb3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 5, 7, 3, 2};
        int[] arr2 = new int[]{1, 1, 1, 1, 1, 1, 1};
        boolean x = true;
        for (int a : arr) {
            if (arr[0] != a) {
                x = false;
            }
        }
    }
}
