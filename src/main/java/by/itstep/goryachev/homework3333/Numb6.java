package by.homework3;

public class Numb6 {
    public static void main(String[] args) {
        int count = 0;
        int number;
        int[] arr = new int[8];
        boolean isUniq = true;
        for (int i = 10000000; i < 99999999; i++) {
            number = i;
            for (int k = 0; k < arr.length; k++) {
                arr[k] = number % 10;
                number /= 10;
            }
            isUniq = true;
            for (int j = 0; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[j]==arr[k]) {
                        isUniq = false;
                        break;
                    }
                }
                if (!isUniq){
                    break;
                }
            }
            if (isUniq && i % 12345 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Всего " + count + " чисел!");
    }
}