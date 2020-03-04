package by.itstep.goryachev.threadhomework;

public class MaxArray extends Thread{
    public int [] arr;

    public MaxArray(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        int result = arr [0];
        for (int i : arr) {
            result = result > i ? result : i;
        }
        System.out.println("Максимальное число в массиве " + result);
    }
}


