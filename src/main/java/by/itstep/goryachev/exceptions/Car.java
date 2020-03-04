package by.itstep.goryachev.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class Car {
    public void getInfo () {
        try {
            FileWriter fileWriter = new FileWriter("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
