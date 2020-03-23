package by.itstep.goryachev.pasta;


public class Main {
    public static void main(String[] args) {
        PastaFactory pastaFactory = new PastaFactory();
        System.out.println(pastaFactory.getPasta("raviolli").typePasta());
        System.out.println(pastaFactory.getPasta("fetuchini").typePasta());
        System.out.println(pastaFactory.getPasta("carbonara").typePasta());

        System.out.println(pastaFactory.getPasta("raviolli"));
        System.out.println(pastaFactory.getPasta("raviolli"));
        System.out.println(pastaFactory.getPasta("raviolli"));
        System.out.println(pastaFactory.getPasta("raviolli"));
        System.out.println(pastaFactory.getPasta("raviolli"));
        System.out.println(pastaFactory.getPasta("raviolli"));
        System.out.println(pastaFactory.getPasta("raviolli"));


    }
}
