package AbstractFactory.usa;

import AbstractFactory.factory.Truck;

public class Freightliner implements Truck {
    @Override
    public void start() {
        System.out.println("Freightliner encendido.");
    }

    @Override
    public void stop() {
        System.out.println("Freightliner apagado.");
    }
}