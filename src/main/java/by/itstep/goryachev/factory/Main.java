package by.itstep.goryachev.factory;


public class Main {
    public static void main(String[] args) {
//        Cars sedanCar = new SedanCarCreator().createCar();
//        Cars cabrio = new CabrioCreator().createCar();
//
//        System.out.println(sedanCar.getClass());
        carCreate("sedan");
    }

    static void carCreate(String type){
        switch (type) {
            case "sedan":
                new SedanCarCreator().createCar();
                break;
            case "cabrio":
                new CabrioCreator().createCar();
        }
    }
}
