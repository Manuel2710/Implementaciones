package AbstractFactory.europe;

import AbstractFactory.factory.Truck;

public class Mercedes implements Truck {
    @Override
    public void start() {
        System.out.println("Mercedes Benz encendido.");
    }

    @Override
    public void stop() {
        System.out.println("Mercedes Benz apagado.");
    }
}