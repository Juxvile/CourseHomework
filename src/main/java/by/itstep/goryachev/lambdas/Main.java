package by.itstep.goryachev.lambdas;

public class Main {
    public static void main(String[] args) {

        Printable prt = str -> System.out.println(str);
        prt.printString("Hello BOYS");
    }
}
