package by.itstep.goryachev.oop;


public class Adress {
    private String city;
    private String street;
    private int building;
    private int room;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }


    public Adress (){
    }

    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building=" + building +
                ", room=" + room +
                '}';
    }

    public Adress(String city, String street, int building, int room) {
        this.city = city;
        this.street = street;
        this.building = building;
        this.room = room;
    }
}
