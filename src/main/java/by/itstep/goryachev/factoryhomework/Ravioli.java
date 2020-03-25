package by.itstep.goryachev.factoryhomework;

public class Ravioli implements Pasta{
    @Override
    public String typePasta() {
        return "ravioli";
    }

    @Override
    public String sauce() {
        return "tomato";
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