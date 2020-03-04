package by.itstep.goryachev.threadhomework;


public class Average extends Thread{
    private int [] arr;

    public Average(int[] arr) {
        this.arr = arr;
    }
    @Override
    public void run() {
        int sum = 0;
        int average = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            average = sum / arr.length;
        }
        System.out.println("Среднее арифметическое всех чисел массива " + average);
    }
}
