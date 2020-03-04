package by.itstep.goryachev.collect.maps;


import java.util.ArrayList;
import java.util.ListIterator;

public class Maps {
    public static void main(String[] args) {
        ArrayList <String>  stringArrayList = new ArrayList<>();
        stringArrayList.add ("one");
        stringArrayList.add ("two");
        stringArrayList.add ("three");
        stringArrayList.add ("four");
        stringArrayList.add ("five");
        stringArrayList.add ("six");


        ListIterator<String> iterator = stringArrayList.listIterator();
        while (iterator.hasPrevious()) {
            System.out.println(iterator.hasPrevious());
        }
    }
}
