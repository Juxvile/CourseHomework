package by.itstep.goryachev.threadhomework;

public class MinArray extends Thread{

    private int [] arr;

    public MinArray(int[] arr) {
        this.arr = arr;
    }
    @Override
    public void run () {
        int result = arr [0];
        for (int i : arr) {
            result = result < i ? result : i;
        }
        System.out.println("Минимальное число в массиве " + result);
    }
}
