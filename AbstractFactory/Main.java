package AbstractFactory;

import java.util.Scanner;

import AbstractFactory.factory.Truck;
import AbstractFactory.factory.TruckFactory;

public class Main {
    public static void main(String[] args) {
       
        // crear menu
        System.out.println("Bienvenido al sistema de creación de camiones");
        System.out.println("Por favor, ingrese la región de origen del camión (USA o Europe): ");
        // leer input del usuario
        Scanner scanner = new Scanner(System.in);
        String region = scanner.nextLine();

        // Crear la fábrica correspondiente
        TruckFactory factory;
    
        if (region.equals("USA" ) || region.equals("usa" ) || region.equals("Usa")) {

            factory = new UsaFactory(); //usamos factory de USA

        } else if (region.equals("Europe") || region.equals("EUROPE") || region.equals("europe")) {

            factory = new EuropeFactory(); //usamos factory de EUROPE

        } else {

            System.out.println("Región no válida");
            return; // terminar la ejecución del programa por error

        }

        // crear un camión utilizando la fábrica
        Truck truck = factory.createTruck();

        // decirle al usuario que este camion es de la region seleccionada pero al azar
        System.out.println("\nSe ha creado un camión de la región " + region + " al azar:");

        // probar el camión, 1 para encender, 2 para apagar, 3 para crear nuevo camión y 4 para salir
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Encender camión");
        System.out.println("2. Apagar camión");
        System.out.println("3. Crear nuevo camión de la región");
        System.out.println("4. Salir");

        // leer input del usuario
        scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        
        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    truck.start();
                    break;
                case 2:
                    truck.stop();
                    break;
                case 3:
                    truck = factory.createTruck();
                    System.out.println("\nSe ha creado un camión de la región " + region + " al azar:");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            // leer input del usuario
            System.out.println("\nSeleccione una opción:");
            opcion = scanner.nextInt();
        }
        scanner.close();
    }
}