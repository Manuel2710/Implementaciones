import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // usuario selecciona el tipo de documento que desea solicitar
        // menu de opciones
        System.out.println("Bienvenido al sistema de solicitud de documentos");
        System.out.println("Seleccione el tipo de documento que desea solicitar:");
        System.out.println("1. Acuerdo");
        System.out.println("2. Contrato");
        System.out.println("3. Notificación");

        // leer input del usuario
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        System.out.println();

        String nombre;


        // solicitar el documento seleccionado segun el input
        switch (opcion) {
            case 1:
                Solicitud solicitudAcuerdo = new SolicitudAcuerdo();
                Documento acuerdo = solicitudAcuerdo.solicitar();

                System.out.println("Ingrese el nombre del cliente");
                nombre = scanner.next();
                System.out.println();
                scanner.close();

                acuerdo.setNombre(nombre);
                acuerdo.printData();
                break;
            
            case 2:
                Solicitud solicitudContrato = new SolicitudContrato();
                Documento contrato = solicitudContrato.solicitar();

                System.out.println("Ingrese el nombre del cliente");
                nombre = scanner.next();
                System.out.println();
                scanner.close();

                contrato.setNombre(nombre);
                contrato.printData();
                break;

            case 3:
                Solicitud solicitudNotificacion = new SolicitudNotificacion();
                Documento notificacion = solicitudNotificacion.solicitar();

                System.out.println("Ingrese el nombre del cliente");
                nombre = scanner.next();
                System.out.println();
                scanner.close();

                notificacion.setNombre(nombre);
                notificacion.printData();
                break;

            default:
                break;
        }
    }
}
