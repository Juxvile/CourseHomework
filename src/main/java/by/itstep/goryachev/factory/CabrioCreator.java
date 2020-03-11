package by.itstep.goryachev.factory;


public class CabrioCreator implements CarCreator{
    @Override
    public Cars createCar(){
        return new Cabrio();
    }
}
