package by.itstep.goryachev.interfaces;

public class Main {
    public static void main(String[] args) {
        Program program = new Program();
        program.printLetter();
        ProgramTwo programtwo = new ProgramTwo();
        programtwo.printLetter();
        program.printWord("Hello");
        System.out.println(program.sum(3, 9));
        System.out.println(program.writeStr());
    }
}
