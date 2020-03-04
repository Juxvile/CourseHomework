package by.itstep.goryachev.files;

import java.io.Serializable;

public class Adress implements Serializable{
    String street;
    String city;

    public Adress(String street, String city) {
        this.street = street;
        this.city = city;
    }
}
