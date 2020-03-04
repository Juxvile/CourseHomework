package by.itstep.goryachev.interfaces;


import java.util.Scanner;

public class Program implements Printable, Writable{
//    public void printLetter() {
//        System.out.println("f");
//    }

    public void printWord(String word) {
        System.out.println(word);
    }

    public int sum(int a, int b) {

        return a + b;
    }

    public String writeStr() {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }


}
