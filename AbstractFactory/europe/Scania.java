package AbstractFactory.europe;

import AbstractFactory.factory.Truck;

public class Scania implements Truck {
    @Override
    public void start() {
        System.out.println("Scania encendido.");
    }

    @Override
    public void stop() {
        System.out.println("Scania apagado.");
    }
}