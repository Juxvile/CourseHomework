package by.itstep.goryachev.math;
//Написать программу, которая проверяет, все ли значения
//элементов массива различные (не повторяются). Вывести:
//Yes – если все различные и No – если имеется хоть одно повторение. Массив задается и инициализируется в начале
//программы.

public class Numb4 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 9, 8, 5, 7};
        boolean x = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if(arr[i] != arr[j]){
                    x = true;
                } else {
                    x = false;
                    break;
                }
            }
            if (!x) {
                break;
            }
        }
        System.out.println(x ? "Yes" : "No");
    }
}