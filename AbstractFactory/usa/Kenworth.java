package AbstractFactory.usa;

import AbstractFactory.factory.Truck;

public class Kenworth implements Truck {
    @Override
    public void start() {
        System.out.println("Kenworth encendido.");
    }

    @Override
    public void stop() {
        System.out.println("Kenworth apagado.");
    }
}