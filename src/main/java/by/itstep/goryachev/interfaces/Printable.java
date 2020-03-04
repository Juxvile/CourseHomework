package by.itstep.goryachev.interfaces;


public interface Printable {
    default void printLetter(){
        System.out.println("rrr");
    };
    void printWord(String word);
    int sum (int a, int b);
}
