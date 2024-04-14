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
        scanner.close();

        // solicitar el documento seleccionado segun el input
        switch (opcion) {
            case 1:
                Solicitud solicitudAcuerdo = new SolicitudAcuerdo();
                Documento acuerdo = solicitudAcuerdo.solicitar("Juan Pérez", "Acuerdo de confidencialidad", "2021-01-01");
                break;
            
            case 2:
                Solicitud solicitudContrato = new SolicitudContrato();
                Documento contrato = solicitudContrato.solicitar("Juan Pérez", "Contrato de trabajo", "2021-01-01");
                break;

            case 3:
                Solicitud solicitudNotificacion = new SolicitudNotificacion();
                Documento notificacion = solicitudNotificacion.solicitar("juan@perez.com", "Este es un mensaje de notificación");
                break;

            default:
                break;
        }
    }
}
