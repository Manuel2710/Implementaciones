package AbstractFactory;

import AbstractFactory.factory.Truck;
import AbstractFactory.factory.TruckFactory;
import AbstractFactory.europe.*;;

// factory para europe
public class EuropeFactory implements TruckFactory {
    
    @Override
    public Truck createTruck() {
        // se realizara un random para seleccionar un camion al azar
        // ya que lo importante es la implementacion de la factory

        //crear un camion al azar
        int cantidadCamionesEurope = 3; // cantidad de camiones

        int random = (int) (Math.random() * cantidadCamionesEurope); // número al azar entre 0 y cantidadCamionesEurope

        switch (random) {
            case 0:
                return new Mercedes();
            case 1:
                return new Volvo();
            case 2:
                return new Scania();
                
            default:
                return new Mercedes();
        }
    }
}