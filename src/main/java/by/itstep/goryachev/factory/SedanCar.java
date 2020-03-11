package by.itstep.goryachev.factory;


public class SedanCar implements Cars {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public SedanCar() {

    }

    public SedanCar(String model) {
        this.model = model;
    }

    @Override
    public void typeCar() {

    }
}
