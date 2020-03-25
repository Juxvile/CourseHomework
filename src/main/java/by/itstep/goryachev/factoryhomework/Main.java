package by.itstep.goryachev.factoryhomework;

//Создайте приложение для приготовления пасты.
//        Приложение должно уметь создавать минимум три вида
//        пасты. Классы различной пасты должны иметь следующие методы:
//        ■ Тип пасты;
//        ■ Соус;
//        ■ Начинка;
//        ■ Добавки.
//        Для реализации используйте порождающие паттерны.

public class Main {
    public static void main(String[] args) {
        PastaFactory pastaFactory = new PastaFactory();
        System.out.println(pastaFactory.getPasta("ravioli").typePasta());
        System.out.println(pastaFactory.getPasta("ravioli").sauce());
        System.out.println(pastaFactory.getPasta("ravioli").filling());
        System.out.println(pastaFactory.getPasta("ravioli").spices());
        System.out.println();
        System.out.println(pastaFactory.getPasta("carbonara").typePasta());
        System.out.println(pastaFactory.getPasta("carbonara").sauce());
        System.out.println(pastaFactory.getPasta("carbonara").filling());
        System.out.println(pastaFactory.getPasta("carbonara").spices());
        System.out.println();
        System.out.println(pastaFactory.getPasta("tagliatelle").typePasta());
        System.out.println(pastaFactory.getPasta("tagliatelle").sauce());
        System.out.println(pastaFactory.getPasta("tagliatelle").filling());
        System.out.println(pastaFactory.getPasta("tagliatelle").spices());
    }
}