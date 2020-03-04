package by.itstep.goryachev.interfaces.interf;


public class Array implements Printable {

    int [] arr;

    public Array(int[] arr) {
        this.arr = arr;
    }

    public Array() {
    }

    @Override
    public void print() {
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }

    @Override
    public void print(String info) {
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("]");
        System.out.println(info);
    }

}
