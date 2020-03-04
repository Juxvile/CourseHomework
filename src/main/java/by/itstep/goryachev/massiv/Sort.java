package by.itstep.goryachev.massiv;


import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
//        int [] arr = {9, 13, 20, 31, 3, 16, 22, 99};
//        System.out.println(Arrays.toString(arr));
//        boolean isChanged = false;
//        while (!isChanged) {
//            isChanged = true;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//                isChanged = false;
//            }
//        }
//        }
//        System.out.println(Arrays.toString(arr));
//        int [] arr = {32, 21, 17, 19, 3, 7, 9, 11};
//        System.out.println(Arrays.toString(arr));
//
//        for (int j = 0; j < arr.length; j++) {
//
//            for (int i = j + 1; i < arr.length; i++) {
//
//                if (arr[j] > arr[i]) {
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));




        int [] arr = {32, 21, 17, 19, 19, 17, 21, 32};
        int [] arr2 = new int[arr.length];

//        if (arr[0] == arr[7] && arr[1] == arr [6] && arr[2] == arr [5] && arr [3] == arr [4]) {
//
//        }

        for (int i = 0, j = arr.length; i <= arr.length / 2; i++, j--){
            if(arr[i] == arr[j]){
               continue;
            }
            System.out.println("No");
        }
    }
}
