package by.itstep.goryachev.factoryhomework;

public class PastaFactory {
    Pasta getPasta (String pasta) {
        switch (pasta) {
            case "carbonara":
                return new Carbonara();
            case "ravioli":
                return new Ravioli();
            case "tagliatelle":
                return new Tagliatelle();
            default:
                return null;
        }
    }
}