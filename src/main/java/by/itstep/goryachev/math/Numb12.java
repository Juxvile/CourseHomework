package by.itstep.goryachev.math;



import java.util.Arrays;

//Программа должна выводить слово Yes для симметричного массива и слово No – для несимметричного.
//Симметричным считается массив, в котором значения элементов с
//конца равно значению элементов с начала. Массив задается
//и инициализируется в начале программы.
//Примеры значений для симметричного массива:
//        1, 2, 3, 2, 1
//        2, 2, 3, 2, 2
//        1, 3, 2, 3, 1
//        5, 4, 3, 4, 5
public class Numb12 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3, 9, 3, 5, 1};
        int[] arr2 = arr.clone();
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        if (Arrays.equals(arr,arr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
