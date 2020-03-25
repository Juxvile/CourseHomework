package by.itstep.goryachev.factoryhomework;

public class Tagliatelle implements Pasta{
    @Override
    public String typePasta() {
        return "tagliatelle";
    }

    @Override
    public String sauce() {
        return "bolognese";
    }

    @Override
    public String filling() {
        return "pork meat";
    }

    @Override
    public String spices() {
        return "salt, pepper";
    }
}