package AbstractFactory;

import AbstractFactory.factory.Truck;
import AbstractFactory.factory.TruckFactory;
import AbstractFactory.usa.*;

// factory de usa
public class UsaFactory implements TruckFactory {
    @Override
    public Truck createTruck() {
        // se realizara un random para seleccionar un camion al azar
        // ya que lo importante es la implementacion de la factory
        
        //crear un camion al azar
        int cantidadCamionesUsa = 3; // cantidad de camiones, contando desde 0

        int random = (int) (Math.random() * cantidadCamionesUsa); // número al azar entre 0 y cantidadCamionesUsa

        switch (random) {
            case 0:
                return new Freightliner();
            case 1:
                return new Mack();
            case 2:
                return new Kenworth();
                
            default:
                return new Freightliner();
        }
    }
}