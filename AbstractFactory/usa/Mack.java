package AbstractFactory.usa;

import AbstractFactory.factory.Truck;

public class Mack implements Truck {
    @Override
    public void start() {
        System.out.println("Mack encendido.");
    }

    @Override
    public void stop() {
        System.out.println("Mack apagado.");
    }
}