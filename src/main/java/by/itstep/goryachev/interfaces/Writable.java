package by.itstep.goryachev.interfaces;


import java.util.Scanner;

public interface Writable {
    String writeStr ();
        default public String writeString() {
            System.out.println("Enter a String");
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }
}
