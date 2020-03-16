package by.itstep.goryachev.patterns;

import java.util.ArrayList;
import java.util.List;

public class MainObserver {
    public static void main(String[] args) {
        Cat cat = new Cat(4);
        ConcreteObserver co = new ConcreteObserver();
        cat.addObserver(co);
        cat.setWeight(5);
        cat.setWeight(5);
        cat.removeObserver(co);
        cat.setWeight(5);
    }
}

interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}

class Cat implements Observable{

    private int weight;

    public Cat(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
        notifyObserver();
    }

    List<Observer> listObservers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        listObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        listObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        listObservers.forEach(Observer::handleEvent);
    }
}

interface Observer {
    void handleEvent();
}

class ConcreteObserver implements Observer {

    @Override
    public void handleEvent() {
        System.out.println("Котик поправился");
    }
}