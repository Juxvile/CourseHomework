package by.itstep.goryachev.pasta;


public class PastaFactory {
    Pasta getPasta (String pasta) {
        switch (pasta) {
            case "carbonara":
                return new Carbonara();
            case "fetuchini":
                return new Fetuchini();
            case "raviolli":
                return new Raviolli();
            default: return null;
        }
    }
}
