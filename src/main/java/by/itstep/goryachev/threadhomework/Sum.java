package by.itstep.goryachev.threadhomework;

public class Sum  extends Thread{
    private int [] arr;

    public Sum(int[] arr) {
        this.arr = arr;
    }
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма всех элементов в массиве " + sum);
    }
}
