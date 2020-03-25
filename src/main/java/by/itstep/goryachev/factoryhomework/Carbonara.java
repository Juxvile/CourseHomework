package by.itstep.goryachev.factoryhomework;


public class Carbonara implements Pasta {

    @Override
    public String typePasta() {
        return "carbonara";
    }

    @Override
    public String sauce() {
        return "cream";
    }

    @Override
    public String filling() {
        return "ham";
    }

    @Override
    public String spices() {
        return "oregano";
    }
}