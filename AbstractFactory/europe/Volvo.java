package AbstractFactory.europe;

import AbstractFactory.factory.Truck;

public class Volvo implements Truck {
    @Override
    public void start() {
        System.out.println("Volvo encendido.");
    }

    @Override
    public void stop() {
        System.out.println("Volvo apagado.");
    }
}