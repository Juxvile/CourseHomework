package by.itstep.goryachev.collect;


import java.util.LinkedHashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Set<Integer> integerSet = new LinkedHashSet<>();

        integerSet.add(2);
        integerSet.add(1);
        integerSet.add(4);
        integerSet.add(15);
        integerSet.add(6);
        integerSet.add(87);
        integerSet.add(48);
        integerSet.add(29);

        for (int i : integerSet) {
            System.out.println(i);

        }
    }
}
